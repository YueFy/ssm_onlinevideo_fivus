document.writeln("<div class='header-top-strip' id='home'>")
document.writeln("<div class='container'>")
document.writeln("<div class='header-top-left'>")
document.writeln("<p><a href='../support.html'>24/7 客服服务</a></p>")
document.writeln("<button class='btn btn-primary' data-toggle='modal' data-target='#myModal'>登录</button>")
document.writeln("<button id='idLoginout' class='btn btn-primary'>注销</button>")

document.writeln("<form action='/login/upimg' method='post' enctype='multipart/form-data'>")
document.writeln("<input type='file' class='btn btn-primary' name='img'value='选择您想要的换的头像'/>")
document.writeln("<input type='text' hidden='true' name='iduserId' value='' id='iduserId' />")
document.writeln("<input type='submit' class='btn btn-primary' id='idTJ' value='改变头像'/></form>")

document.writeln("</div>")
document.writeln("<div class='header-top-right'>")
document.writeln("<div class='modal fade'>")
document.writeln("<div class='modal-dialog'>")
document.writeln("<div class='modal-content'>")
document.writeln("<div class='modal-header'>")
document.writeln("<button type='button' class='close' data-dismiss='modal' aria-label='Close'><span aria-hidden='true'>&times;</span></button>")
document.writeln("<h4 class='modal-title'>Modal title</h4>")
document.writeln("</div>")
document.writeln("<div class='modal-body'>")
document.writeln("<p>One fine body&hellip;</p>")
document.writeln("</div>")
document.writeln("<div class='modal-footer'>")
document.writeln("<button type='button' class='btn btn-default' data-dismiss='modal'>Close</button>")
document.writeln("<button type='button' class='btn btn-primary'>Save changes</button>")
document.writeln("</div>")
document.writeln("</div><!-- /.modal-content -->")
document.writeln("</div><!-- /.modal-dialog -->")
document.writeln("</div><!-- /.modal -->")
document.writeln("<!---pop-up-box---->")
document.writeln("<script>")
document.writeln("$(document).ready(function () {")
document.writeln("$('.popup-with-zoom-anim').magnificPopup({")
document.writeln("type: 'inline',")
document.writeln("fixedContentPos: false,")
document.writeln("fixedBgPos: true,")
document.writeln("overflowY: 'auto',")
document.writeln("closeBtnInside: true,")
document.writeln("preloader: false,")
document.writeln("midClick: true,")
document.writeln("removalDelay: 300,")
document.writeln("mainClass: 'my-mfp-zoom-in'")
document.writeln("});")
document.writeln("}); </script>")
document.writeln("<!-- Large modal -->")


document.writeln("<a id='idUserInfoLink' type='button'><img id='idUserImgUrl' src='portrait/initImg.jpg'></a>")


document.writeln("<div class='modal fade' id='myModal' tabindex='-1' role='dialog' aria-labelledby='myLargeModalLabel'aria-hidden='true'>")
document.writeln("<div class='modal-dialog modal-lg'>")
document.writeln("<div class='modal-content'>")
document.writeln("<div class='modal-header'>")
document.writeln("<button type='button' class='close' data-dismiss='modal' aria-hidden='true'>&times;")
document.writeln("</button>")
document.writeln("<h4 class='modal-title' id='myModalLabel'>登录/注册</h4>")
document.writeln("</div>")
document.writeln("<div class='modal-body'>")
document.writeln("<div class='row'>")
document.writeln("<div class='col-md-8' style='border-right: 1px dotted #C2C2C2;padding-right: 30px;'>")
document.writeln("<!-- Nav tabs -->")
document.writeln("<ul class='nav nav-tabs'>")
document.writeln("<li class='active'><a href='#Login' data-toggle='tab'>登录</a></li>")
document.writeln("<li><a href='#Registration' data-toggle='tab'>注册</a></li>")
document.writeln("</ul>")
document.writeln("<!-- Tab panes -->")
document.writeln("<div class='tab-content'>")
document.writeln("<div class='tab-pane active' id='Login'>")
document.writeln("<form role='form' class='form-horizontal'>")
document.writeln("<div class='form-group'>")
document.writeln("<label for='email' class='col-sm-2 control-label'>邮箱</label>")
document.writeln("<div class='col-sm-10'>")
document.writeln("<input type='email' class='form-control' id='email1'placeholder='Email'/>")
document.writeln("</div> </div>")
document.writeln("<div class='form-group'>")
document.writeln("<label for='exampleInputPassword1' class='col-sm-2 control-label'>密码</label>")
document.writeln("<div class='col-sm-10'>")
document.writeln("<input type='password' class='form-control'id='exampleInputPassword1' placeholder='password'/>")
document.writeln("</div> </div>")
document.writeln("<div class='row'>")
document.writeln("<div class='col-sm-2'></div>")
document.writeln("<div class='col-sm-10'>")
document.writeln("<button id='idloginUser' type='button' class='btn btn-primary btn-sm'>登录</button>")
document.writeln("<a href='javascript:;'>忘记密码?</a>")
document.writeln("</div> </div> </form> </div>")
document.writeln("<div class='tab-pane' id='Registration'>")
document.writeln("<form role='form' class='form-horizontal'>")
document.writeln("<div class='form-group'>")
document.writeln("<label for='email' class='col-sm-2 control-label'>昵称</label>")
document.writeln("<div class='col-sm-10'>")
document.writeln("<div class='row'>")
document.writeln("<div class='col-md-9'>")
document.writeln("<input id='idregisterName' type='text' class='form-control'placeholder='昵称'/></div> </div> </div> </div>")
document.writeln("<div class='form-group'>")
document.writeln("<label for='email' class='col-sm-2 control-label'>邮箱</label>")
document.writeln("<div class='col-sm-10'>")
document.writeln("<input id='idregisterEmail' type='email' class='form-control' id='email'placeholder='邮箱用来登录'/></div> </div>")
document.writeln("<div class='form-group'>")
document.writeln("<label for='mobile' class='col-sm-2 control-label'>手机号</label>")
document.writeln("<div class='col-sm-10'>")
document.writeln("<input id='idregisterMobile' type='email' class='form-control' id='mobile'placeholder='手机号可以不填'/></div> </div>")
document.writeln("<div class='form-group'>")
document.writeln("<label for='password' class='col-sm-2 control-label'>密码</label>")
document.writeln("<div class='col-sm-10'>")
document.writeln("<input id='idregisterPwd' type='password' class='form-control' id='password'placeholder='您的密码'/></div></div>")
document.writeln("<div class='row'>")
document.writeln("<div class='col-sm-2'> </div>")
document.writeln("<div class='col-sm-10'>")
document.writeln("<button id='idregisterUser' type='button' class='btn btn-primary btn-sm'>申请并登录</button>")
document.writeln("<button type='button' class='btn btn-default btn-sm'>取消 </button> </div> </div> </form> </div> </div>")
document.writeln("<div id='OR' class='hidden-xs'>OR </div> </div>")
document.writeln("<div class='col-md-4'>")
document.writeln("<div class='row text-center sign-with'>")
document.writeln("<div class='col-md-12'>")
document.writeln("<h3 class='other-nw'>第三方平台登陆</h3></div>")
document.writeln("<div class='col-md-12'>")
document.writeln("<div class='btn-group btn-group-justified'>")
document.writeln("<a href='#' class='btn btn-primary'>QQ</a> <a id='idbaidulogin' href='https://openapi.baidu.com/oauth/2.0/authorize?response_type=code&client_id=QRNSQLU3qPwzW3VE6naC2zCui2TR2x9K&redirect_uri=http://localhost:8081/login/baidulogin&display=popup'class='btn btn-danger'>百度</a> </div> </div> </div> </div> </div> </div> </div> </div> </div>")
document.writeln("<script>$('#myModal').modal('no'); </script> </div>")
document.writeln("<div class='clearfix'></div> </div> </div>")



var userid = GetQueryString("userid");

var userId=$.cookie("userId");

var fuid ;
var registerTime;
var loginTime;
var avatar ;
var name;
var email;
var phone;
var pwd;
var sta ;

window.onload = function() {
    $("#iduserId").val(userId);
}

function GetQueryString(name)
{
    var reg = new RegExp("(^|&)"+ name +"?=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}
$("#idUserInfoLink").click(function () {
    sta = {"userId":userId}
    $.ajax({
        url:"/login/showUser",
        type:"POST",
        data:sta,
        dataType:"json",
        //contentType:"application/json;charset=utf-8",
        error:function(msg){
            alert("请重新登录"+msg);
        },
        success:function (result) {
            fuid=result.fuId;
            registerTime = result.registerTime;
            loginTime = result.loginTime;
            avatar = result.avatar;
            $("#idUserImgUrl").attr("src",avatar);
            $.cookie('userid',userid);
            alert("您的昵称："+fuid+"\n您的注册时间："+registerTime+"\n您的登录时间："+loginTime);
        }
    })
})
$("#idimgUpload").click(function () {
    $.ajax({
        url:"/login/upimg",
        type:"POST",
        data:{"date":new Date()},
        dataType:"json",
        //contentType:"application/json;charset=utf-8",
        error:function(msg){
            $.cookie('userId',result.userId);
            alert("请重新上传您想换的头像");
        },
        success:function (result,status) {
            $.cookie('userId',result.userId);
            fuid=result.fuId;
            avatar = result.avatar;
            $("#idUserImgUrl").attr("src",avatar);
            alert("头像更新成功");
            window.location.reload();
        }
    })
})
$("#idregisterUser").click(function () {
    name = $("#idregisterName").val();
    email = $("#idregisterEmail").val();
    phone = $("#idregisterMobile").val();
    pwd = $("#idregisterPwd").val();
    $.ajax({
        url:"/login/register",
        data:{"name":name,"email":email,"phone":phone,"pwd":pwd},
        type:"POST",
        dataType:"json",
        success:function (result,status) {
            fuid=result.fuId;
            registerTime = result.registerTime;
            loginTime = result.loginTime;
            alert("您的昵称："+fuid+"\n您的注册时间："+registerTime+"\n您的登录时间："+loginTime);
            $.cookie('userId',result.userId);
            window.location.reload();
        },
        error:function(msg){
            alert("注册失败，请联系我们");
        }
    })
})
$("#idloginUser").click(function () {
    email = $("#email1").val();
    pwd = $("#exampleInputPassword1").val();
    $.ajax({
        url:"/login/fivuslogin",
        data:{"email":email,"pwd":pwd},
        type:"post",
        dataType:"json",
        success:function (result) {
            fuid=result.fuId;
            registerTime = result.registerTime;
            loginTime = result.loginTime;
            $.cookie('userId',result.userId);
            alert("您的昵称："+fuid+"\n您的注册时间："+registerTime+"\n您的登录时间："+loginTime);
            window.location.reload();
        },
        error:function(msg){
            $.cookie('userId',userId);
            alert("请点击首页头像");
        }
    })
})
$("#idLoginout").click(function () {
    $.cookie('userId',0);
    alert("您已注销");
    window.location.reload();
})

