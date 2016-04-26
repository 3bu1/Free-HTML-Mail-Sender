<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#send").click(function(){
		//alert($("#excel").val());
	});
	
});
$(function()
	    {
	        $('#send').on('change',function ()
	        {
	            var filePath = $(this).val();
	            console.log(filePath);
	        });
	    });
</script> -->
</head>
<body>
<form  method="post" action="Mail" enctype="multipart/form-data">
<input type="file" name="excel" id="excel"/>
<div class="input"><input class="username"  type="hidden" placeholder="Name" name="usernamemail" style=""></div>
<div class='submit'><input type="submit" value="send" id="send"/></div>
 	</form>
</body>
</html>