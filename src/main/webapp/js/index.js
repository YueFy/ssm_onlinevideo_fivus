$(function(){


});
function homeInit(){
    alert("init")

    url = "videoController/initHome";
    data = {};
    type = "json";
    $.post(
        url,
        data,

        function(result,status){
            setImage(result);
            setVideoByReviewOrder(result);
        },
   type);
}
function  setImage(result) {
    var element1 = document.getElementById('randomImage1');
    element1.src =result.videoImageUrl1

    var element2 = document.getElementById('randomImage2');
    element2.src =result.videoImageUrl2

    var element3 = document.getElementById('randomImage3');
    element3.src =result.videoImageUrl3

    var element4 = document.getElementById('randomImage4');
    element4.src =result.videoImageUrl4
}
function setVideoByReviewOrder(result) {
    $(goodVideoName1).html(result.videoReview1);
    $(goodVideoName2).html(result.videoReview2);
    $(goodVideoName3).html(result.videoReview3);
    $(goodVideoName4).html(result.videoReview4);
    $(goodVideoName5).html(result.videoReview5);
    $(goodVideoName6).html(result.videoReview6);
    $(goodVideoName7).html(result.videoReview7);



}