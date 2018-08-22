var topResult;
var onShowResult;
var immediateResult;
//抬头4张照片
function homeInit(){

    url = "videoController/initHome";
    data = {};
    type = "json";
    $.post(
        url,
        data,

        function(result,status){
            topResult =  result;
            setImage();
            setVideoByReviewOrder();
            setGoodVideo();
        },
   type);
}
//设置抬头四张照片
function  setImage() {
    var element1 = document.getElementById("randomImage1");
    element1.setAttribute("src",topResult.video1.imagUrl);
    var element2 = document.getElementById("randomImage2");
    element2.setAttribute("src",topResult.video2.imagUrl);
    var element3 = document.getElementById("randomImage3");
    element3.setAttribute("src",topResult.video3.imagUrl);
    var element4 = document.getElementById("randomImage4");
    element4.setAttribute("src",topResult.video4.imagUrl);
}
//设置口碑
function setVideoByReviewOrder() {
    $(goodVideoName1).html(topResult.video1.videoName);
    $(goodVideoName2).html(topResult.video2.videoName);
    $(goodVideoName3).html(topResult.video3.videoName);
    $(goodVideoName4).html(topResult.video4.videoName);
    $(goodVideoName5).html(topResult.video5.videoName);
    $(goodVideoName6).html(topResult.video6.videoName);
    $(goodVideoName7).html(topResult.video7.videoName);
    $(goodVideoName8).html(topResult.video8.videoName);
    $(goodVideoName9).html(topResult.video9.videoName);
    $(goodVideoName10).html(topResult.video10.videoName);

}

//正在即将电影展示
function onTheShow(){
    url = "videoController/onShowVideo";
    data = {};
    type = "json";
    $.post(
        url,
        data,

        function(result,status){
            onShowResult =  result;
            setOnShowVideo();

        },
        type);

}
//设置正在上映的电影
function  setOnShowVideo() {
    var element1 = document.getElementById("onShowVideo1");
    element1.setAttribute("src",onShowResult.onShowVideo1.imagUrl);
    var element2 = document.getElementById("onShowVideo2");
    element2.setAttribute("src",onShowResult.onShowVideo2.imagUrl);
    var element3 = document.getElementById("onShowVideo3");
    element3.setAttribute("src",onShowResult.onShowVideo3.imagUrl);

}
//即将上映
function immediateShow(){
    url = "videoController/immediateShow";
    data = {};
    type = "json";
    $.post(
        url,
        data,

        function(result,status){
            immediateResult =  result;
            setImmediateVideo()
        },
        type);

}

//设置即将上映的电影
function  setImmediateVideo() {
    var element1 = document.getElementById("immediateShow1");
    element1.setAttribute("src",immediateResult .immediateVideo1.imagUrl);
    var element2 = document.getElementById("immediateShow2");
    element2.setAttribute("src",immediateResult .immediateVideo2.imagUrl);
    var element3 = document.getElementById("immediateShow3");
    element3.setAttribute("src",immediateResult .immediateVideo3.imagUrl);

}
//佳片精选



function  setGoodVideo() {
    //设置图片
    var element1 = document.getElementById("goodVideo1");
    element1.setAttribute("src",topResult.video1.imagUrl);

    var element2 = document.getElementById("goodVideo2");
    element2.setAttribute("src",topResult.video2.imagUrl);

    var element3 = document.getElementById("goodVideo3");
    element3.setAttribute("src",topResult.video3.imagUrl);

    var element4 = document.getElementById("goodVideo4");
    element4.setAttribute("src",topResult.video4.imagUrl);

    var element5 = document.getElementById("goodVideo5");
    element5.setAttribute("src",topResult.video5.imagUrl);

    var element6 = document.getElementById("goodVideo6");
    element6.setAttribute("src",topResult.video6.imagUrl);
    //设置电影名字
    $(name1).html(topResult.video1.videoName);
    $(name2).html(topResult.video2.videoName);
    $(name3).html(topResult.video3.videoName);
    $(name4).html(topResult.video4.videoName);
    $(name5).html(topResult.video5.videoName);
    $(name6).html(topResult.video6.videoName);
    //设置电影持续时间
    $(lastingTime1).html(topResult.video1.lastingTime);
    $(lastingTime2).html(topResult.video2.lastingTime);
    $(lastingTime3).html(topResult.video3.lastingTime);
    $(lastingTime4).html(topResult.video4.lastingTime);
    $(lastingTime5).html(topResult.video5.lastingTime);
    $(lastingTime6).html(topResult.video6.lastingTime);

}
