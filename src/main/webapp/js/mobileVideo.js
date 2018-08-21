function mobileInit() {
    mobileInit();
}
function mobileVideoIni() {
    alert("init")

    url = "videoController/initMobileVideo";
    data = {};
    type = "json";
    $.post(
        url,
        data,

        function(result,status){
            setMobileVideo(result);

        },
        type);

}
function  setMobileVideo(result) {
    var element1 = document.getElementById('mobileShow1');
    element1.src =result.mobileVideo1.imagUrl

    $(title1).html(result.mobileVideo1.videoName);
    $(date1).html(result.mobileVideo1.showTime);
    $(language1).html(result.mobileVideo1.videoLanguage);

}