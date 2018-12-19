
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" charset="utf-8">
    var loginDialog;
    var defaultUserInfoDialog;
    $(function() {
        $('#loginForm input').keyup(function(event) {
            if (event.keyCode == '13') {
                loginFun();
            }
        });

        loginDialog = $('#loginDialog').show().dialog({
            modal : true,
            closable : false,
            buttons : [ {
                text : '注册',
                handler : function() {
                    $('#registerDialog').dialog('open');
                }
            }, {
                text : '登录',
                handler : function() {
                    loginFun();
                }
            } ]
        });


        var sessionInfo_userId = '${sessionInfo.id}';
        if (sessionInfo_userId) {/*目的是，如果已经登陆过了，那么刷新页面后也不需要弹出登录窗体*/
            loginDialog.dialog('close');
            defaultUserInfoDialog.dialog('close');
        }
    });
    function loginFun() {
            if ($('#loginForm').form('validate')) {
                parent.$.messager.progress({
                    title : '提示',
                    text : '数据处理中，请稍后....'
                });
                $.post('${pageContext.request.contextPath}/user/login', $('#loginForm').serialize(), function(result) {
                    if (result.success) {

                        $('#loginDialog').dialog('close');
                        $('#sessionInfoDiv').html($.formatString('[<strong>{0}</strong>]，欢迎你！您使用[<strong>{1}</strong>]IP登录！', result.obj.name, result.obj.ip));
                    } else {
                        $.messager.alert('错误', result.msg, 'error');
                    }
                    parent.$.messager.progress('close');
                }, "JSON");
            }
    }
</script>





<div id="loginDialog" title="用户登录" style="width: 300px; height: 180px; overflow: hidden; display: none;">
    <form id="loginForm" method="post">
        <table class="table table-hover table-condensed">
            <tr>
                <th>登录名</th>
                <td><input name="username" type="text" placeholder="请输入登录名" class="easyui-validatebox" data-options="required:true" value="123456"></td>
            </tr>
            <tr>
                <th>密码</th>
                <td><input name="password" type="password" placeholder="请输入密码" class="easyui-validatebox" data-options="required:true" value=""></td>
            </tr>
        </table>
    </form>
</div>
