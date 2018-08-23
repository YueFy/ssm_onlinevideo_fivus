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

        // 设置videoUrl
        //    设置指针
            var index = 0;

            for(var key in result) {
                var videoHref = "movie-select-show.html?videoName=" + encodeURI(encodeURI(result[key].videoName))
                    + "&videoLanguage=" + encodeURI(encodeURI(result[key].videoLanguage)) + "&lastingTime="
                    + result[key].lastingTime + "&showTime=" + result[key].showTime
                    + "&imagUrl=" + result[key].imagUrl + "&videoUrl=" + result[key].videoUrl;

                var value = "<a href=" + videoHref + "> "
                    + "<img  src=" + result[key].imagUrl + " alt=\"我是图片\"/></a> "
                    + "<div class=\"slide-title\"><h4>" + result[key].videoName + "</h4></div> "
                    + "<div class=\"date-city\"> <h5>上映日期:" + result[key].showTime + "</h5>"
                    + "<h6>本片语言:" + result[key].videoLanguage + "</h6> "
                    + "<div class=\"buy-tickets\"> " +
                    "<a href=" + videoHref + ">在线观看</a> </div>" +
                    " </div>";


                $("#flexiselDemo1").append("<li>" + value + "</li>");


            }

                index++;

                // var videoIndex ="videoIndex"+index;
                // // var title = 'title'+index;
                // // var date = 'date'+index;
                // // var language = 'language'+index;
                // //图片
                // var elementImage = document.getElementById('mobileImage'+index);
                // elementImage.setAttribute("src",result[key].imagUrl);
                //
                // $(title+index).html(result[key].videoName);
                // alert(result[key].videoName);
                // $(date+index).html(result[key].showTime);
                // $(language+index).html(result[key].videoLanguage);
                // //传递链接
                // .document.getElementById(videoIndex).href = "movie-select-show.html?videoName="+ encodeURI(encodeURI(result[key].videoName))
                //     + "&videoLanguage=" +encodeURI(encodeURI(result[key].videoLanguage))+"&lastingTime="
                //     +result[key].lastingTime+"&showTime="+result[key].showTime
                //     + "&imagUrl="+result[key].imagUrl+"&videoUrl="+result[key].videoUrl;
                // index++;


            //指针归零
            index = 0;
        }
