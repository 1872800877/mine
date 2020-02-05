require.config({
    baseUrl:"/mine/common",
    paths: {
        axios:"axios.min",
    }
});
define(["axios"],
    function(axios) {
        return {
            addUser: function(User,callback) {
                axios({
                    method: 'POST',
                    url: '/mine/login/register',
                    data: {
                        'username': User.username,
                        'password':User.password,
                        'confirmPassword':User.confirmPassword,
                        'nickName':User.nickName
                    }
                }).then((respon)=> {
                    callback(respon);
                }).catch((err)=> {
                    alert("请求失败");
                }) ;
            },
            getUserByLogin: function(User,callback) {
                axios({
                    method: 'POST',
                    url: '/mine/login/login',
                    data: {
                        'username': User.username,
                        'password':User.password,
                        'verifyCode':User.verifyCode
                    }
                }).then((respon)=> {
                    callback(respon);
                }).catch((err)=> {
                    alert("请求失败");
                }) ;
            }
        }
    }
);