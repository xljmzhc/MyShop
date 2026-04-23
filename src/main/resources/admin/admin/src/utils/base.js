const base = {
    get() {
        return {
            url : "http://localhost:8080/MyShop/",
            name: "MyShop",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/MyShop/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于springboot+vue的校园二手交易系统"
        } 
    }
}
export default base
