$(document).ready(function(e) {
	$(document).on('click', function(event) {
		   $('.lbOverlay, .Login, .Register, .forgotPassword').fadeOut(10);
	});

	$('.loginHold a.logBtn, .loginHold_mobl a.logBtn').on('click', function() {
		$('.lbOverlay, .Login').fadeIn(500);
		return false;
	 });
	 
     $('.loginHold a.regBox, .loginHold_mobl a.regBox').on('click', function() {
		$('.lbOverlay, .Register').fadeIn(500);
		return false;
	 });
	 
	  $('.formContainer').on('click', function(event) {
		event.stopPropagation();
	 });
	 
	$(".browsBtn").click(function(){
	   $(".btnHide").click();
	});
	
	$('.newAc').on('click', function() {
		$('.Login').fadeOut(10);
		$('.lbOverlay, .Register').fadeIn(500);
		return false;
	 });
	 
	 $('.forgotPass').on('click', function() {
		$('.Login').fadeOut(10);
		$('.lbOverlay, .forgotPassword').fadeIn(500);
		return false;
	 });
	 
	 $('.signIn').on('click', function() {
		$('.Register, .forgotPassword').fadeOut(10);
		$('.lbOverlay, .Login').fadeIn(500);
		return false;
	 });
	 
	var winW = $(window).width();
	if(winW > 767){
		$('.tabList li a').click(function(){
		  var crt = $(this).parent().index();
		  $(this).addClass('activeTab').parent().siblings().find('a').removeClass('activeTab');
		  $('.tabData:visible').hide();
		  $('.tabData:eq('+crt+')').show();
			
		  return false;	
	 });	
	};
	
	var ind, actPos, expandPos;
	$('.tabContainer h4').click(function () {
        ind = $('.tabContainer h4').index(this)
		actPos = $(this).parent().offset().top - 30;
        expandPos = $(this).parent().siblings().find('.tabData').outerHeight(true);
        
		$(this).parent().siblings('.tabContainer').find('.tabData').slideUp(500);	
		$(this).parent().find('.tabData').slideDown(500);
		$("html, body").animate({ scrollTop: actPos }, 500);

    });
	
	 var ind, positionTop, listH, listPrevHeight, actualPos;
	  $('.tabContainer h4').click(function(){
		  ind = $('.tabContainer h4').index(this);
			positionTop = $('.tabContainer h4').offset().top;
			listH = $(this).outerHeight(true);
			listPrevHeight = $(this).parent().siblings('.tabContainer').find('.tabData').outerHeight(true);
			actualPos = positionTop + (ind * listH) - 30;

			$("html, body").animate({ scrollTop: actualPos }, 500);
	  })
	  
	  $('.paymentMode').change(function(){
            $('.payDtls').hide();
            $('.paymentBox').show();
            $('#' + $(this).val()).show();
       });
	   
	   $('.bookFD').click(function(){
            $('.newFD').show();
       });
	   
	   $('.bookRD').click(function(){
            $('.newRD').show();
       });
	   
	   $('.applyLoan').click(function(){
            $('.newLoan').show();
       });
		
		$('input[type=file]').change(function(e) {
			$in = $(this);
			$in.next().html($in.val());
			
		});

		$('.uploadButton').click(function() {
			var fileName = $("#fileUpload").val();
			if (fileName) {
				alert(fileName + " can be uploaded.");
			}
			else {
				alert("Please select a file to upload");
			}
		});
		
		$('.userName').click(function(){
			$('.ddBox').slideToggle(100);
		})
		
		$('.ddBox span').click(function(){
			$('.userName, .ddBox').fadeOut(100);
		})
		
	  /*
	  var ind = 0, pagiLen, tabWidth, liW, liWidth;
		pagiLen = $('.tabList ul li').length;
		tabWidth =  $('.tabList ul').outerWidth();
		liWidth =  $('.tabList ul li').width();
		liW = (tabWidth / pagiLen)-1;
		
		$('.tabList ul li').width(liW);
		var tabListWidth = 0;
		
		$('.tabList ul li').each(function () {
			
			//tabListWidth += $(this).outerWidth(true);
		})

	  */
	  
	
});
