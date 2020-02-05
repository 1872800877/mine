define(["resolve"], function(resolve){
    return [
        {
            path: "/home",
            name: "home",
            component: resolve("../js/xx.js")
        },
        {
            path: "/news",
            name: "news",
            component: resolve("../js/xx.js")
        }
    ];
});