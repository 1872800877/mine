define(["../common/axios.min"],
    function(axios) {
        return {
            getHotArticles(callback){
                axios({
                    method: 'GET',
                    url: '/mine/getHotArticle',
                }).then((respon)=> {
                    callback(respon);
                }).catch((err)=> {
                    alert("请求失败");
                })
            },
            getArticleTypes(callback) {
                axios({
                    method: 'GET',
                    url: '/mine/articleType/getAllArticleType',
                }).then((respon) => {
                    callback(respon);
                }).catch((err) => {
                })
            },
            addArticle(Article,callback){
                axios({
                    method: 'post',
                    url: '/mine/article/saveArticle',
                    data:{
                        "articleTypeid":Article.articleTypeid,
                        "articleContent":Article.articleContent,
                        "articleTitle":Article.articleTitle
                    }
                }).then((respon)=> {
                    callback(respon);
                }).catch((err)=> {
                }) ;

            },
            deleteArticle(Article,callback){
                axios({
                    method: 'post',
                    url: '/mine/article/deleteArticleById',
                    data:{
                        "id":Article.id,
                    }
                }).then((respon)=> {
                    callback(respon);
                }).catch((err)=> {
                }) ;
            },
            updateArticle(Article,callback){
                axios({
                    method: 'post',
                    url: '/mine/article/alterArticle',
                    data:{
                        "id":Article.id,
                        "articleTypeid":Article.articleTypeid,
                        "articleContent":Article.articleContent,
                        "articleTitle":Article.articleTitle
                    }
                }).then((respon)=> {
                    callback(respon);
                }).catch((err)=> {
                }) ;
            }
        }
    }
);