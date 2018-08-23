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
    document.getElementById('goodVideoUrl1').href="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video1.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video1.videoLanguage)) + "&lastingTime="
        + topResult.video1.lastingTime + "&showTime=" + topResult.video1.showTime
        + "&imagUrl=" + topResult.video1.imagUrl + "&videoUrl=" + topResult.video1.videoUrl;

    $(goodVideoName2).html(topResult.video2.videoName);
    document.getElementById('goodVideoUrl2').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video2.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video2.videoLanguage)) + "&lastingTime="
        + topResult.video1.lastingTime + "&showTime=" + topResult.video2.showTime
        + "&imagUrl=" + topResult.video2.imagUrl + "&videoUrl=" + topResult.video2.videoUrl;

    $(goodVideoName3).html(topResult.video3.videoName);
    document.getElementById('goodVideoUrl3').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video3.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video3.videoLanguage)) + "&lastingTime="
        + topResult.video3.lastingTime + "&showTime=" + topResult.video3.showTime
        + "&imagUrl=" + topResult.video3.imagUrl + "&videoUrl=" + topResult.video3.videoUrl;

    $(goodVideoName4).html(topResult.video4.videoName);
    document.getElementById('goodVideoUrl4').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video4.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video4.videoLanguage)) + "&lastingTime="
        + topResult.video4.lastingTime + "&showTime=" + topResult.video4.showTime
        + "&imagUrl=" + topResult.video4.imagUrl + "&videoUrl=" + topResult.video4.videoUrl;

    $(goodVideoName5).html(topResult.video5.videoName);
    document.getElementById('goodVideoUrl5').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video5.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video5.videoLanguage)) + "&lastingTime="
        + topResult.video5.lastingTime + "&showTime=" + topResult.video5.showTime
        + "&imagUrl=" + topResult.video5.imagUrl + "&videoUrl=" + topResult.video5.videoUrl;

    $(goodVideoName6).html(topResult.video6.videoName);
    document.getElementById('goodVideoUrl6').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video6.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video6.videoLanguage)) + "&lastingTime="
        + topResult.video6.lastingTime + "&showTime=" + topResult.video6.showTime
        + "&imagUrl=" + topResult.video6.imagUrl + "&videoUrl=" + topResult.video6.videoUrl;

    $(goodVideoName7).html(topResult.video7.videoName);
    document.getElementById('goodVideoUrl7').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video7.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video7.videoLanguage)) + "&lastingTime="
        + topResult.video7.lastingTime + "&showTime=" + topResult.video7.showTime
        + "&imagUrl=" + topResult.video7.imagUrl + "&videoUrl=" + topResult.video7.videoUrl;


    $(goodVideoName8).html(topResult.video8.videoName);
    document.getElementById('goodVideoUrl8').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video8.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video8.videoLanguage)) + "&lastingTime="
        + topResult.video8.lastingTime + "&showTime=" + topResult.video8.showTime
        + "&imagUrl=" + topResult.video8.imagUrl + "&videoUrl=" + topResult.video8.videoUrl;

    $(goodVideoName9).html(topResult.video9.videoName);
    document.getElementById('goodVideoUrl9').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video9.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video9.videoLanguage)) + "&lastingTime="
        + topResult.video9.lastingTime + "&showTime=" + topResult.video9.showTime
        + "&imagUrl=" + topResult.video9.imagUrl + "&videoUrl=" + topResult.video9.videoUrl;

    $(goodVideoName10).html(topResult.video10.videoName);
    document.getElementById('goodVideoUrl10').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video10.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video10.videoLanguage)) + "&lastingTime="
        + topResult.video10.lastingTime + "&showTime=" + topResult.video10.showTime
        + "&imagUrl=" + topResult.video10.imagUrl + "&videoUrl=" + topResult.video10.videoUrl;

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

    document.getElementById('showVideo1').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(onShowResult.onShowVideo1.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(onShowResult.onShowVideo1.videoLanguage)) + "&lastingTime="
        + onShowResult.onShowVideo1.lastingTime + "&showTime=" + onShowResult.onShowVideo1.showTime
        + "&imagUrl=" + onShowResult.onShowVideo1.imagUrl + "&videoUrl=" + onShowResult.onShowVideo1.videoUrl;


    var element2 = document.getElementById("onShowVideo2");
    element2.setAttribute("src",onShowResult.onShowVideo2.imagUrl);
    document.getElementById('showVideo2').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(onShowResult.onShowVideo2.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(onShowResult.onShowVideo2.videoLanguage)) + "&lastingTime="
        + onShowResult.onShowVideo2.lastingTime + "&showTime=" + onShowResult.onShowVideo2.showTime
        + "&imagUrl=" + onShowResult.onShowVideo2.imagUrl + "&videoUrl=" + onShowResult.onShowVideo2.videoUrl;


    var element3 = document.getElementById("onShowVideo3");
    element3.setAttribute("src",onShowResult.onShowVideo3.imagUrl);

    document.getElementById('showVideo3').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(onShowResult.onShowVideo3.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(onShowResult.onShowVideo3.videoLanguage)) + "&lastingTime="
        + onShowResult.onShowVideo3.lastingTime + "&showTime=" + onShowResult.onShowVideo3.showTime
        + "&imagUrl=" + onShowResult.onShowVideo3.imagUrl + "&videoUrl=" + onShowResult.onShowVideo3.videoUrl;


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
    document.getElementById('immediateShowVideo1').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(immediateResult .immediateVideo1.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(immediateResult .immediateVideo1.videoLanguage)) + "&lastingTime="
        + immediateResult .immediateVideo1.lastingTime + "&showTime=" + immediateResult .immediateVideo1.showTime
        + "&imagUrl=" + immediateResult .immediateVideo1.imagUrl + "&videoUrl=" + immediateResult .immediateVideo1.videoUrl;


    var element2 = document.getElementById("immediateShow2");
    element2.setAttribute("src",immediateResult .immediateVideo2.imagUrl);
    document.getElementById('immediateShowVideo2').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(immediateResult .immediateVideo2.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(immediateResult .immediateVideo2.videoLanguage)) + "&lastingTime="
        + immediateResult .immediateVideo2.lastingTime + "&showTime=" + immediateResult .immediateVideo2.showTime
        + "&imagUrl=" + immediateResult .immediateVideo2.imagUrl + "&videoUrl=" + immediateResult .immediateVideo2.videoUrl;



    var element3 = document.getElementById("immediateShow3");
    element3.setAttribute("src",immediateResult .immediateVideo3.imagUrl);
    document.getElementById('immediateShowVideo3').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(immediateResult .immediateVideo3.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(immediateResult .immediateVideo3.videoLanguage)) + "&lastingTime="
        + immediateResult .immediateVideo3.lastingTime + "&showTime=" + immediateResult .immediateVideo3.showTime
        + "&imagUrl=" + immediateResult .immediateVideo3.imagUrl + "&videoUrl=" + immediateResult .immediateVideo3.videoUrl;



}
//佳片精选



function  setGoodVideo() {
    //设置图片
    var element1 = document.getElementById("goodVideo1");
    element1.setAttribute("src",topResult.video1.imagUrl);
    document.getElementById('goGoodVideo1').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video1.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video1.videoLanguage)) + "&lastingTime="
        + topResult.video1.lastingTime + "&showTime=" + topResult.video1.showTime
        + "&imagUrl=" + topResult.video1.imagUrl + "&videoUrl=" + topResult.video1.videoUrl;



    var element2 = document.getElementById("goodVideo2");
    element2.setAttribute("src",topResult.video2.imagUrl);
    document.getElementById('goGoodVideo2').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video2.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video2.videoLanguage)) + "&lastingTime="
        + topResult.video2.lastingTime + "&showTime=" + topResult.video2.showTime
        + "&imagUrl=" + topResult.video2.imagUrl + "&videoUrl=" + topResult.video2.videoUrl;


    var element3 = document.getElementById("goodVideo3");
    element3.setAttribute("src",topResult.video3.imagUrl);
    document.getElementById('goGoodVideo3').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video3.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video3.videoLanguage)) + "&lastingTime="
        + topResult.video3.lastingTime + "&showTime=" + topResult.video3.showTime
        + "&imagUrl=" + topResult.video3.imagUrl + "&videoUrl=" + topResult.video3.videoUrl;


    var element4 = document.getElementById("goodVideo4");
    element4.setAttribute("src",topResult.video4.imagUrl);
    document.getElementById('goGoodVideo4').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video4.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video4.videoLanguage)) + "&lastingTime="
        + topResult.video4.lastingTime + "&showTime=" + topResult.video4.showTime
        + "&imagUrl=" + topResult.video4.imagUrl + "&videoUrl=" + topResult.video4.videoUrl;


    var element5 = document.getElementById("goodVideo5");
    element5.setAttribute("src",topResult.video5.imagUrl);
    document.getElementById('goGoodVideo5').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video5.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video5.videoLanguage)) + "&lastingTime="
        + topResult.video1.lastingTime + "&showTime=" + topResult.video5.showTime
        + "&imagUrl=" + topResult.video5.imagUrl + "&videoUrl=" + topResult.video5.videoUrl;


    var element6 = document.getElementById("goodVideo6");
    element6.setAttribute("src",topResult.video6.imagUrl);
    document.getElementById('goGoodVideo6').href ="movie-select-show.html?videoName=" + encodeURI(encodeURI(topResult.video6.videoName))
        + "&videoLanguage=" + encodeURI(encodeURI(topResult.video6.videoLanguage)) + "&lastingTime="
        + topResult.video6.lastingTime + "&showTime=" + topResult.video6.showTime
        + "&imagUrl=" + topResult.video6.imagUrl + "&videoUrl=" + topResult.video6.videoUrl;


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
