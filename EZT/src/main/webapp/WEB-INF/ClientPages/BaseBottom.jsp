<script type="text/javascript">
<!-- 通用脚本接口,带有表格提交页面专用 //-->
	function formSubmit(url, sTarget) {
		$('.submitFrm').attr("target", sTarget);
		$('.submitFrm').attr("action", url);
		$('.submitFrm').submit();
		return true;
	}
	
	$("#all").click(function(){
		$(".roleId").attr("checked",$(this).attr("checked"));
	});
	function checkAll() {
		$(".roleId").attr("checked",$("#all").attr("checked") );
	}
	$("#valiimg").click(function(){
		$(this).attr("src","/img/valiImg.action"+Math.random());
	});
</script>