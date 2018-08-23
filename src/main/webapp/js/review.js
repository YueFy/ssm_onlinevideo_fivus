var reviewResult;
function reviewInit() {
    alert("init")

    url = "reviewController/initReview";
    data = {};
    type = "json";
    $.post(
        url,
        data,
        function(result,status){
            reviewResult = result;
            setReview(result);
        },
        type);

}
function  setReview(result) {
    //指针
    var index=0;

            $(reviewContent1).html(result.review1.content);
            $(reviewContent2).html(result.review2.content);
            $(reviewContent3).html(result.review3.content);
            $(reviewContent4).html(result.review4.content);
            $(reviewContent5).html(result.review5.content);
            $(reviewContent6).html(result.review6.content);
            $(reviewContent7).html(result.review7.content);



    //归零
    var index = 0;
}
