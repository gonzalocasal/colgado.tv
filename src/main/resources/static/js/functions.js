//ON READY
$(document).ready(function(a) {  

    //REMOVE SCROLLBAR FROM PLAYER
    $("#ciframe").attr("scrolling", "no");
    
    //TOP BAR SHADOW
    var  tb = $('.header');
    tbs = "top-bar-scrolled";
    $(window).scroll(function() {
        if($(this).scrollTop()) {
            tb.addClass(tbs);
        } else {
           tb.removeClass(tbs);
        }
    });

});


//CLICK CARDS
function redirect(link){
    window.location=link;
}

//REMOVE LOCAL CACHE ON NEW VERSION OR EVENT
if ((localStorage.VERSION !== VERSION ) || (localStorage.EVENT !== EVENT && ACTIVE ==="tv")) {
    localStorage.setItem("VERSION", VERSION);
    localStorage.setItem("EVENT", EVENT);
    window.location.reload(true);
}


function closeAd(){
    $("#float-layer").css({opacity: "0"});
    $(".player-container-tv").css({
    'filter'         : 'blur(0px)',
    });  
    setTimeout(function() {$("#float-layer").css({display: "none"});}, 500);
}

//FACEBOOK SHARE POP-UP
function facebookShare(){    
    window.open('http://www.facebook.com/share.php?u='+window.location.href, 'newwindow', 'width=300, height=250')
    return false;
}

//TWITTER SHARE POP-UP 
function twitterShare(){
    window.open('http://twitter.com/share?url='+window.location.href, 'newwindow', 'width=300, height=250');
    return false;
}

//HIDE PLAYER SHIELD
function hideShield(){
    $("#shield").hide();
    $("#player-protected").show();
    $("#player-protected").append(content);
    $("#ciframe").attr("scrolling", "no");
}

//FADEIN LOADING PLAYER
$(".player-container").css({opacity: "1"});
setTimeout(function() {
    $("#float-layer").css({opacity: "1"});
    $("#close").css({opacity: "1"});
    }, 500);



//CONTACT SUBMIT 
function submitContacto(){
    $("#submit").click();
}


//CONTACT MESSAGE 
function acceptMessage(){
   document.location.href="/";
}


var app = angular.module('colgado', []);