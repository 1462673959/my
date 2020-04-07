<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/users.css"/>
<script src="js/jquery/2.0.0/jquery.min.js"></script>
<script src="js/vue/vue.min.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
	<table id="table" >
			<thead>
				<tr>
				<td>id</td>
				<td>账号</td>
				<td>密码</td>
				<td>昵称</td>
			</tr>
			</thead>
			<tbody>
				<tr v-for="u in users">
				<td>{{u.id}}</td>
				<td>{{u.uName}}</td>
				<td>{{u.uNo}}</td>
				<td>{{u.uPassword}}</td>
				</tr>
				<tr>
					<a v-on:click="">首页</a>
					<a v-on:click="">上一页</a>
					<a v-on:click="">下一页</a>
					<a v-on:click="">尾页</a>
				</tr>
			</tbody>
			
		</table>
		<script type="text/javascript">
			var app=new Vue({
				el:'#table',
				data:{
					users:'',
					page: {"start":0,"count":6,"last":0}
				},
				/*method:{
				 	 fisrt: function(){
						this.page.start = 0;
						units();
					},
					next: function(){
						this.page.start = this.page.start + this.page.count;
						units();
					},
					per: function(){
						this.page.start = this.page.start - this.page.count;
						units();
					},
					last: function(){
						this.page.start = this.page.last;
						units();
					    }, 
					units: function(){
						
				    }
				}, */
				mounted:function(){
					var self = this;
					var u = "http://localhost:8181/ssm/list";
					 $.ajax({
							type:"post",
				               url: u,
				               data:JSON.stringify(self.page),
				               dataType:"json",
				               contentType : "application/json;charset=UTF-8",
				               success: function(result){
				            	   self.users = eval(result.responseText);
				               }
			         });  
					
					
					/* if(window.XMLHttpRequest){
					       var oAjax=new XMLHttpRequest();
					    }else{
					       var oAjax=new ActiveXObject("Microsoft.XMLHTTP");
					    }
						
					    //2.连接服务器（打开和服务器的连接）
					    oAjax.open('GET', url, true);
					    //3.发送
					    oAjax.send();
					    //4.接收
					    oAjax.onreadystatechange=function (){
					       if(oAjax.readyState==4){
					           if(oAjax.status==200){
					        	   self.users = eval(oAjax.responseText);
					           }else{
					              alert('失败了');
					           }
					        }
					    }; */
					}
				
			
			});
		</script>
</body>
</html>