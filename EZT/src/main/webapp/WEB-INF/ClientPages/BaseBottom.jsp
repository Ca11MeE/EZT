<script type="text/javascript">
<!-- 通用脚本接口,带有表格提交页面专用 //-->
	function formSubmit(url, sTarget) {
		$('.submitFrm').attr("target", sTarget);
		$('.submitFrm').attr("action", url);
		$('.submitFrm').submit();
		return true;
	}
	function checkAll(item) {
		$("."+item).attr("checked",$("#all").is(':checked') );
	}
	$("#valiimg").click(function(){
		$(this).attr("src","/img/valiImg.action"+Math.random());
	});
</script>