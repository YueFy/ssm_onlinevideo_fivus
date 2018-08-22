var mobileResult;
function mobileVideoInit() {

        url = "videoController/initMobileVideo";
        data = {};
        type = "json";
        $.post(
            url,
            data,
            function(result,status){
                mobileResult = result;
                setMobileVideo(result);
                           },
              type);

        }
        function  setMobileVideo(result) {
            var element1 = document.getElementById('mobileImage1');
            element1.src =result.mobileVideo1.imagUrl
            $(title1).html(result.mobileVideo1.videoName);
            $(date1).html(result.mobileVideo1.showTime);
            $(language1).html(result.mobileVideo1.videoLanguage);

            var element2 = document.getElementById('mobileImage2');
            element2.src =result.mobileVideo2.imagUrl
            $(title2).html(result.mobileVideo2.videoName);
            $(date2).html(result.mobileVideo2.showTime);
            $(language2).html(result.mobileVideo2.videoLanguage);

            var element3 = document.getElementById('mobileImage3');
            element3.src =result.mobileVideo3.imagUrl
            $(title3).html(result.mobileVideo3.videoName);
            $(date3).html(result.mobileVideo3.showTime);
            $(language3).html(result.mobileVideo3.videoLanguage);

            var element4 = document.getElementById('mobileImage4');
            element4.src =result.mobileVideo4.imagUrl
            $(title4).html(result.mobileVideo4.videoName);
            $(date4).html(result.mobileVideo4.showTime);
            $(language4).html(result.mobileVideo4.videoLanguage);

            var element5 = document.getElementById('mobileImage5');
            element5.src =result.mobileVideo5.imagUrl
            $(title5).html(result.mobileVideo5.videoName);
            $(date5).html(result.mobileVideo5.showTime);
            $(language5).html(result.mobileVideo5.videoLanguage);

            var element6 = document.getElementById('mobileImage6');
            element6.src =result.mobileVideo6.imagUrl
            $(title6).html(result.mobileVideo6.videoName);
            $(date6).html(result.mobileVideo6.showTime);
            $(language6).html(result.mobileVideo6.videoLanguage);

        // 设置videoUrl
            var index = 1;
            for(var key in result){

                var videoIndex ="videoIndex"+index;

                document.getElementById(videoIndex).href = "movie-select-show.html?videoName="+ encodeURI(encodeURI(result[key].videoName))
                    + "&videoLanguage=" +encodeURI(encodeURI(result[key].videoLanguage))+"&lastingTime="
                    +result[key].lastingTime+"&showTime="+result[key].showTime
                    + "&imagUrl="+result[key].imagUrl+"&videoUrl="+result[key].videoUrl;
                index++;

            }
            var index = 1;

        }
