require.config({
    baseUrl:"/mine/common",
    paths: {
        <!-- jquery -->
        jquery: "jquery-3.4.1.min",
        <!-- 发出请求组件 -->
        axios:"axios.min",
        <!-- vue -->
        vue:"vue.min",
        bootstrap_bundle:"bootstrap/js/bootstrap.bundle.min",
        bootstrap:"bootstrap/js/bootstrap.min",
        ckeditor:"ckeditor",
        popper:"popper"
    },
    waitSeconds:0,
    shim : {
        bootstrap_bundle:['jquery'],
        bootstrap : ['jquery','popper'],
        ckeditor:['jquery']
    },
    map: {
        '*': {
            'popper.js': 'popper'
        }
    }
});
define(['bootstrap_bundle','popper','bootstrap','ckeditor','vue','jquery', 'axios'], function(bootstrap_bundle,popper,bootstrap,ckeditor,vue,$, axios) {
        function loadImage(url, callback) {
            var img = new Image();
            img.src = url;

            // 判断图片是否在缓存中
            if (img.complete) {
                callback(url);
                return;
            }
            // 图片加载到浏览器的缓存中回调函数
            img.onload = function () {
                callback(url);
            }
        }
        //日期
        function getDateFromTimestamp(timestamp, format) {
            if (format == null || format == "") {
                format = "";
            }
            if (timestamp.length > 10) {
                return new Date(timestamp / 1000);
            }
            return dateFormat(new Date(timestamp));
        }
        function dateFormat(time) {
            var datetime = new Date();
            datetime.setTime(time);
            var year = datetime.getFullYear();
            var month = datetime.getMonth() + 1 < 10 ? "0" + (datetime.getMonth() + 1) : datetime.getMonth() + 1;
            var date = datetime.getDate() < 10 ? "0" + datetime.getDate() : datetime.getDate();
            var hour = datetime.getHours() < 10 ? "0" + datetime.getHours() : datetime.getHours();
            var minute = datetime.getMinutes() < 10 ? "0" + datetime.getMinutes() : datetime.getMinutes();
            var second = datetime.getSeconds() < 10 ? "0" + datetime.getSeconds() : datetime.getSeconds();
            return year + "-" + month + "-" + date + " " + hour + ":" + minute + ":" + second;
        }
        let Carousel = (function(){
            let interval={}
            let num= 0//总共多少张图片，用于设置total-background宽度，使图片显示在一行
            let flag=1//是加还是减=》是正向播放还是反向
            let index=0//播放第几个
            let theController=null//容器
            let theTotal=null//装图片的总容器
            let bgs=[]
            let options={}
            return{
                run
            }
            function run(newController,newBgs){
                bgs = newBgs;
                theController = newController;
                if (theController==null||theController==""){
                    theController = $(".total-background").first();
                }
                if (theTotal==null||theTotal==""){
                    theTotal = $(".total-background-img").first();
                }
                let theControllerWidth = $(theController).css("width");
                let bgItemOption = "<div class=\'background-options\'/>";
                $(theController).append(bgItemOption);
                options = $(theController).children(".background-options").eq(0);
                $(options).on("click",".background-option",function () {
                    clearInterval(interval);
                    index = $(options).children(" .background-option").index(this);
                    carousel();
                    interval = setInterval(function (){
                        carousel()
                    }, 3000);
                });
                for (let bg in bgs) {
                    num++;
                    loadImage(bgs[bg],function (src) {
                        let bgItem = "<div class=\'background-img\' style=\'background-image: url("+src+");width:"+parseInt(theControllerWidth)+"px;\'/>";
                        $(theTotal).append(bgItem);
                        let bgItemOption = "<a class=\'background-option\' href='javascript:void(0);' @click='toDisplayThis'></a>";
                        $(options).append(bgItemOption);
                    });
                }
                interval = setInterval(function (){
                    carousel()
                },3000);
            }
            function carousel(){
                var currentValue = $(theController).first().css("width");
                $(theTotal).css("width",parseInt(currentValue)*(num+1));
                $(options).children('.selected').removeClass("selected");
                $(options).children('.background-option').eq(index).addClass("selected");
                $(theTotal).children(".background-img").css("width",parseInt(currentValue)+"px");
                var newValue = (index)*parseInt(currentValue);
                $(theTotal).first().animate({marginLeft : "-"+newValue+"px"},1000);
                let length = $(theTotal).children('.background-img').length-1;
                index+=flag;
                if (length<=index||index<0){
                    flag*=-1;
                    index+=flag;
                }
            }
        })()
    return {
        bootstrap_bundle: bootstrap_bundle,
        popper: popper,
        bootstrap: bootstrap,
        ckeditor: ckeditor,
        vue: vue,
        $: $,
        axios: axios,
        loadImage:loadImage,
        getDateFromTimestamp:getDateFromTimestamp,
        carousel:Carousel
    }
})
