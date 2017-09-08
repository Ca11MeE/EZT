(function($) {
	
    $.fn.fontFlex = function(min, max, mid) {
    	var $this = this;
        $(window).resize(function() {
            var size = window.innerWidth / mid;
            if (size < min) size = min;
            if (size > max) size = max;
            $this.css('font-size', size + 'px');
        }).trigger('resize');
    };
    
    
    $.fn.marginFlex=function (persent) {
		var wh = document.documentElement.clientHeight;
		var eh = $(this).height();
		height=((wh-eh)*persent)+'px';
		$(this).css("margin-top",height);
		};

})(jQuery);