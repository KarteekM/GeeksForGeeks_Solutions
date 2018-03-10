$(document).ready(function(){

	var wow = new WOW({
		boxClass:     'wow',      // animated element css class (default is wow)
		animateClass: 'animated', // animation css class (default is animated)
		offset:       50,          // distance to the element when triggering the animation (default is 0)
		mobile:       false        // trigger animations on mobile devices (true is default)
	});
	wow.init();

	var myLatlng = new google.maps.LatLng(12.9701097, 77.70119049999994);
    var mapOptions = {
        zoom: 14,
        center: myLatlng,
        scrollwheel: false,
        mapTypeId: google.maps.MapTypeId.ROADMAP
    }
    var map = new google.maps.Map(document.getElementById('maps'), mapOptions);

     //=====Initialise Default Marker    
    var marker = new google.maps.Marker({
        position: myLatlng,
        map: map,
        title: 'marker'
     //=====You can even customize the icons here
    });

    $("#scroll-down-arrow").click(function() {
    $('html, body').animate({
        scrollTop: $("#section-services").offset().top
    }, 1200);
});
})

/* ----------------------------- 
Scroll into viewPort Animation
----------------------------- */
$(document).ready(function() {	
	$('.animated').appear(function() {
		var element = $(this),
			animation = element.data('animation'),
			animationDelay = element.data('animation-delay');
			if ( animationDelay ) {

				setTimeout(function(){
					element.addClass( animation + " visible");
				}, animationDelay);

			} else {
				element.addClass( animation + " visible");
			}
	});
});

function initMap() {
        var uluru = {lat: -25.363, lng: 131.044};
        var map = new google.maps.Map(document.getElementById('maps'), {
          zoom: 4,
          center: uluru
        });
        var marker = new google.maps.Marker({
          position: uluru,
          map: map
        });
      }

/* var isShowingChatIcon = true;

function onChatButtonClicked(){
  if( isShowingChatIcon){
    document.getElementById('chat-container').style.display = "block";                    
    document.getElementById("chat-container").className = document.getElementById("chat-container").className.replace(new RegExp('(?:^|\\s)'+ 'ease-out' + '(?:\\s|$)'), ' ')
    document.getElementById('chat-container').className += " ease-in";    
    document.getElementById("chat-button-icons").className = document.getElementById("chat-button-icons").className.replace(new RegExp('(?:^|\\s)'+ 'glyphicon-comment' + '(?:\\s|$)'), ' ')
    document.getElementById('chat-button-icons').className += "glyphicon-remove";   
    isShowingChatIcon = false
  }else{
    document.getElementById('chat-container').style.display = "none";           
    document.getElementById("chat-container").className = document.getElementById("chat-container").className.replace(new RegExp('(?:^|\\s)'+ 'ease-in' + '(?:\\s|$)'), ' ')
    document.getElementById('chat-container').className += " ease-out";   
    document.getElementById("chat-button-icons").className = document.getElementById("chat-button-icons").className.replace(new RegExp('(?:^|\\s)'+ 'glyphicon-remove' + '(?:\\s|$)'), ' ')
    document.getElementById('chat-button-icons').className += "glyphicon-comment"; 
    isShowingChatIcon = true ;
  }
} */