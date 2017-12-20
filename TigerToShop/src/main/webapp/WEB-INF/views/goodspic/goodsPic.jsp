<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>泰格兔电商平台</title>
</head>
<body>

	<script src="/static/js/jquery-3.2.1.js"></script>
	
	<input class="select" type="file" accept="image/*" onchange="change(this)">
	
	<script type="text/javascript">
	function change (obj) {
	    if (!obj.files.length) return;
	    if (obj.files.length > 1) {
	        alert("只允许上传一张图片!");
	        return;
	    }
	    var file = obj.files[0];
	   // var goodsId=$("#goodsId").val();
		//var data={'base64': result,'goodsId':goodsId,"isFirst":isFirst};
	    var reader = new FileReader();
	    reader.onload = function () {
	        var goodsPath = this.result; 
	        alert(goodsPath)
	        $.ajax({
	        	type:'post',
	        	url:'/goodsPic/add',
	        	//contentType: 'application/json;charset=utf-8',
	        	data:{'goodsPath': goodsPath,'goodsId':1,'isFirst':1},
	        	success:function(data){
	        		alert(1);
	        	}
	        });
	    };
	    reader.readAsDataURL(file);
	}
	</script>
</body>

</html>