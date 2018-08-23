var moviesResult
function moviesInit() {
    alert("init")

    url = "videoController/initMovie";
    data = {};
    type = "json";
    $.post(
        url,
        data,
        function(result,status){
            moviesResult = result;
            setMovies(result);
        },
        type);

}
function setMovies(result) {
    // var element1 = document.getElementById('movie1');
    // element1.src =result.movie1.imagUrl
    // $(title1).html(result.movie1.videoName);
    //
    // var element2 = document.getElementById('movie2');
    // element2.src =result.movie2.imagUrl
    // $(title2).html(result.movie2.videoName);
    //
    // var element3 = document.getElementById('movie3');
    // element3.src =result.movie3.imagUrl
    // $(title3).html(result.movie3.videoName);
    //
    // var element4 = document.getElementById('movie4');
    // element4.src =result.movie4.imagUrl
    // $(title4).html(result.movie4.videoName);
    //
    //
    // var element5 = document.getElementById('movie5');
    // element5.src =result.movie5.imagUrl
    // $(title5).html(result.movie5.videoName);
    //
    // var element6 = document.getElementById('movie6');
    // element6.src =result.movie6.imagUrl
    // $(title6).html(result.movie6.videoName);



        document.getElementById('movieIndex1').href = "movie-single.html?videoName="+ encodeURI(encodeURI(result.movie1.videoName))
            + "&imagUrl="+result.movie1.imagUrl+"&videoUrl="+result.movie1.videoUrl;
        document.getElementById('movie1').src = result.movie1.imagUrl;
        $(title1).html(result.movie1.videoName);

    document.getElementById('movieIndex3').href = "movie-single.html?videoName="+ encodeURI(encodeURI(result.movie3.videoName))
        + "&imagUrl="+result.movie3.imagUrl+"&videoUrl="+result.movie3.videoUrl;
    document.getElementById('movie3').src = result.movie3.imagUrl;
    $(title3).html(result.movie3.videoName);

    document.getElementById('movieIndex15').href = "movie-single.html?videoName="+ encodeURI(encodeURI(result.movie15.videoName))
        + "&imagUrl="+result.movie15.imagUrl+"&videoUrl="+result.movie15.videoUrl;
    document.getElementById('movie15').src = result.movie15.imagUrl;
    $(title15).html(result.movie15.videoName);

    document.getElementById('movieIndex18').href = "movie-single.html?videoName="+ encodeURI(encodeURI(result.movie18.videoName))
        + "&imagUrl="+result.movie18.imagUrl+"&videoUrl="+result.movie18.videoUrl;
    document.getElementById('movie18').src = result.movie18.imagUrl;
    $(title18).html(result.movie18.videoName);

    document.getElementById('movieIndex19').href = "movie-single.html?videoName="+ encodeURI(encodeURI(result.movie19.videoName))
        + "&imagUrl="+result.movie19.imagUrl+"&videoUrl="+result.movie19.videoUrl;
    document.getElementById('movie19').src = result.movie19.imagUrl;
    $(title19).html(result.movie19.videoName);

    document.getElementById('movieIndex22').href = "movie-single.html?videoName="+ encodeURI(encodeURI(result.movie22.videoName))
        + "&imagUrl="+result.movie22.imagUrl+"&videoUrl="+result.movie22.videoUrl;
    document.getElementById('movie22').src = result.movie22.imagUrl;
    $(title22).html(result.movie22.videoName);


}