require.config({
    paths: {
        common:"/mine/common/common",
        user:"/mine/js/user",
        article:"/mine/js/articles"
    }
});
define(['common','user','article'], function(common,User,Article) {
    let vue = common.vue;
    let bootstrap = common.bootstrap;
    let ckeditor = common.ckeditor;
    let popper = common.popper;
    let $ = common.$;
    let axios = common.axios;
    new vue({
        el: '#app',
        mounted(){
            this.bgs = bgs;
            this.loginResult.user = user;
            let carousel = common.carousel;
            carousel.run($(".total-background").first(),this.bgs);
            // this.bgAnmiation();
            this.nowYear = new Date().getFullYear();
            this.nowMouth = new Date().getMonth()+1;
            this.nowDay = new Date().getDate();
            if (this.loginResult.user!=null&&this.loginResult.user!=""){
                this.isLogin = false;
                this.isShowLogin = false;
            }
            this.getHotArticles();
            this.getArticleTypes();
            ckeditor.create(document.querySelector("#editor")).then(editor => {
                this.myEditor = editor;
            }).catch(error => {
                console.error(error);
            });
            ckeditor.create(document.querySelector("#alertEditor")).then(editor => {
                this.alertEditor = editor;
            }).catch(error => {
                console.error(error);
            });
        }, data() {
            return {
                bgs:'',
                nowYear:'',
                nowMouth:'',
                nowDay:'',
                isLogin:false,
                isShowLogin:true,
                username:'',
                password:'',
                verifyCode:'',
                loginResult:[],
                confirmPassword:'',
                nickName:'',
                hotArticles:[],
                myEditor:'',
                articleTypes:'',
                theArticle:{
                    "id":"",
                    "articleType":[]
                },
                alertEditor:'',
                theAnimation:''
            }
        }, methods: {
            toast(msg) {
                this.$dialog.toast({
                    mes: msg,
                    timeout: 1500
                });
            }, bgAnmiation(){
                let num = 0;//总共多少张图片，用于设置total-background宽度，使图片显示在一行
                let flag = 1;//是加还是减=》是正向播放还是反向
                let index = 0;//播放第几个
                let bannerWidth = $(".total-background").first().css("width");
                let bgItemOption = "<div class=\'background-options\'/>";
                $(".total-background-img").append(bgItemOption);
                let this_ = this;
                $(".background-options").on("click",".background-option",function () {
                    clearInterval(this_.theAnimation);
                    let index = $(".background-options .background-option").index(this);
                    let flag = 1;
                    this_.carousel(index,flag);
                    this_.theAnimation = setInterval(function () {
                        this_.carousel(index,flag);
                        let length = $(".total-background-img").children('.background-img').length-1;
                        index+=flag;
                        if (length<=index||index<0){
                            flag*=-1;
                            index+=flag;
                        }
                    },3000)
                })
                for (let bg in this.bgs) {//遍历json数组时，这么写p为索引，0,1
                    num++;
                    //异步加载图片
                    common.loadImage(bgs[bg],function (src) {
                        //添加图片
                        let bgItem = "<div class=\'background-img\' style=\'background-image: url("+src+");\'/>";
                        $(".total-background-img").append(bgItem);
                        $(".background-img").css("width",parseInt(bannerWidth));
                        //添加数字按钮
                        let bgItemOption = "<a class=\'background-option\' href='javascript:void(0);' @click='toDisplayThis'></a>";
                        $(".background-options").append(bgItemOption);
                    });
                }
                $(".total-background-img").css("width",parseInt(bannerWidth)*(num+1));
                this.theAnimation = setInterval(function () {
                    this_.carousel(index,flag);
                    let length = $(".total-background-img").children('.background-img').length-1;
                    index+=flag;
                    if (length<=index||index<0){
                        flag*=-1;
                        index+=flag;
                    }
                },3000)
            },carousel(index,flag) {
                var currentValue = $(".total-background").first().css("width");
                $(".background-options").children('.selected').removeClass("selected");
                $(".background-options").children('.background-option').eq(index).addClass("selected");
                $(".background-img").css("width",currentValue);
                var newValue = (index)*parseInt(currentValue);
                $(".total-background-img").first().animate({marginLeft : "-"+newValue+"px"},1000);
            },showLogin(){
                this.isLogin = !this.isLogin;
            },toLogin(){
                var user = {
                    'username': this.username,
                    'password':this.password,
                    'verifyCode':this.verifyCode
                }
                let this_ = this;
                User.getUserByLogin(user,function(respon){
                    this_.loginResult = respon.data.result;
                    if (this_.loginResult.code=="00"){
                        this_.isLogin = false;
                        this_.isShowLogin = false;
                    }else {
                        this_.getVerifyCode();
                        $(".login-tip").first().text(this_.loginResult.message);
                    }
                });
            },getNickName(){
                if (this.loginResult.user!=null&&this.loginResult.user!=""){
                    return this.loginResult.user.masterNickname;
                }else return null;
            },getVerifyCode(){
                $(".verify-code").first().attr("src","login/getVerifyCode?flag="+Math.random());
            },toRegister(){
                let user = {
                    'username': this.username,
                    'password':this.password,
                    'confirmPassword':this.confirmPassword,
                    'nickName':this.nickName
                }
                let this_ = this;
                User.addUser(user,function () {
                    this_.loginResult = respon.data.result;
                    $(".register-tip").first().text(this_.loginResult.message);
                })
            },getHotArticles(){
                let this_ = this;
                Article.getHotArticles(function (respon) {
                    this_.hotArticles = respon.data.hotArticles;
                });
            },getArticleTypes(){
                let this_ = this;
                Article.getArticleTypes(function (respon) {
                    this_.articleTypes = respon.data.articleTypes;
                    this_.theArticle.articleType =this_.articleTypes[0];
                })
            },submitArticle(event){
                var btn = event.currentTarget;
                var flag = false;
                if (!confirm("确认提交？")){
                    return;
                }
                $(btn).prop("disabled", true);
                $(btn).html(
                    `<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span>`
                );
                let article = {
                    "articleTypeid":this.theArticle.articleType.id,
                    "articleContent":this.myEditor.getData(),
                    "articleTitle":this.theArticle.articleTitle
                }
                let this_ = this;
                Article.addArticle(article,function (respon) {
                    $(btn).prop("disabled", false);
                    $(btn).html("提交");
                    alert(respon.data.result.message);
                    if (respon.data.result.code=="00") {
                        this_.theArticle.articleTitle="";
                        this_.myEditor.setData("");
                        this_.getHotArticles();
                    }
                })
            },deleteArticle(id,event){
                var element = event.currentTarget;
                if (!confirm("确认删除？")){
                    return;
                }
                let article = {
                    "id":id,
                }
                let this_ = this;
                Article.deleteArticle(article,function (respon) {
                    alert(respon.data.result.message);
                    if (respon.data.result.code=="00"){
                        $(element).closest(".article").remove();
                    }
                })
            },alterArticle(id,event){
                var element = event.currentTarget;
                if (!confirm("确认修改？")){
                    return;
                }
                this.theArticle.id = id;

            },submitAlterArticle(event){
                let article = {
                    "id":this.theArticle.id,
                    "articleTypeid":this.theArticle.articleType.id,
                    "articleContent":this.alertEditor.getData(),
                    "articleTitle":this.theArticle.articleTitle
                }
                let this_ = this;
                Article.updateArticle(article,function (respon) {
                    alert(respon.data.result.message);
                    if (respon.data.result.code=="00"){
                        $(element).closest(".article").remove();
                    }
                })
            },getDateFromTimestamp(date){
                return common.getDateFromTimestamp(date);
            }
        }
    });
});
