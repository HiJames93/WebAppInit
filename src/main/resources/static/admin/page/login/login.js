layui.use(['form','layer','jquery'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer
        $ = layui.jquery;


    //登录按钮
    form.on("submit(login)", function (data) {
        $(this).text("登录中...").attr("disabled", "disabled").addClass("layui-disabled");
        $.ajax({
            url: "toLogin.do",
            type: "POST",
            data: data.field,
            dataType: "json",
            success: function (res) {
                console.log(res + "************")
                if (res.code == 200) {
                    window.location = "index.do"
                } else {
                    layer.msg(res.msg, {time: 2000});
                }
            }
        });
        /*
        setTimeout(function(){
            window.location.href = "/layuicms2.0";
        },1000);
        */
        console.log(data);
        return false;
    })

    //表单输入效果
    $(".loginBody .input-item").click(function(e){
        e.stopPropagation();
        $(this).addClass("layui-input-focus").find(".layui-input").focus();
    })
    $(".loginBody .layui-form-item .layui-input").focus(function(){
        $(this).parent().addClass("layui-input-focus");
    })
    $(".loginBody .layui-form-item .layui-input").blur(function(){
        $(this).parent().removeClass("layui-input-focus");
        if($(this).val() != ''){
            $(this).parent().addClass("layui-input-active");
        }else{
            $(this).parent().removeClass("layui-input-active");
        }
    })
})
