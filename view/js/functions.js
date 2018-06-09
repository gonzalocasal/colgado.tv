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
$("#player-container").css({opacity: "1"});
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


//SIDE MENU VERTICAL RESPONSIVE
function sideMenuResponsive () {
       var headerSize =  $("#header").height();
        var itemsTopPosition = $("#items").position().top;
        var menuTop = $('#menu').css('top');
        var menuHeight = window.innerHeight - headerSize;
        if(menuTop== "0px"){
            $("#items").css("height", menuHeight);
        }else{
            $("#items").css("height", menuHeight - headerSize);
        }
}; 

//SIDE MENU ICON CLICK
function menuClick(){
    var MENU_OPENED = $("#menu").hasClass("on");
    if ( MENU_OPENED){
        $("#menu").removeClass("on");
        $("#menu").removeClass("mclick");
        $("#menu").addClass("slide-in");
        $(".menu-icon").removeClass("menu-icon-open");
        localStorage.setItem("MENU_OPENED", "false");
    }else {
        sideMenuResponsive();
        $(".menu-icon").addClass("menu-icon-open");
        $(".slide-in").toggleClass("on"), 
        $("#menu-search").focus(), 0 == MENU_OPENED && (
            $("#header").css({zIndex: "999"}),
            $("#player").css({zIndex: "998"})
        );
    }
}

//SIDE MENU ITEMS CLICK
$(".menu-link").click(function() {
    localStorage.setItem("menuScrollPosition", $("#items").scrollTop());
}),

//SIDE MENU VERTICAL RESPONSIVE
$(window).resize(function() {
   sideMenuResponsive();
}),

//SEARCH IN SIDE MENU
function(a) {
    function b(b, c) {
        a("#menu-search").change(function() {
            var b = a(this).val();
            return b ? (a("#items").find("a:not(:Contains(" + b + "))").parent().fadeOut(),
                a("#items").find("a:Contains(" + b + ")").parent().fadeIn()) : a("#items").find("li").fadeIn(), !1;
        }).keyup(function() {
            a(".menu-separator").css("display", "none"), a(this).change();
        });
    }
    jQuery.expr[":"].Contains = function(a, b, c) {
        return (a.textContent || a.innerText || "").toUpperCase().indexOf(c[3].toUpperCase()) >= 0;
    }, a(function() {
        b(a("#list"), a("#items"));
    });
}(jQuery)

var app = angular.module('colgado', []);