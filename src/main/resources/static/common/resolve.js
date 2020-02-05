define(["require", "promise"], function(require, Q){
    var resolve = function(dep) {
        return function() {
            if (!(dep instanceof Array)) {
                dep = [dep];
            }
            var deferred = Q.defer();
            require(dep, function(res) {
                deferred.resolve(res);
            });//欢迎加入全栈开发交流圈一起学习交流：864305860
            return deferred.promise;
        };
    };
    return resolve;
});