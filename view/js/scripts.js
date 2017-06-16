//ON READY
$(document).ready(function(a) {  
    //CHECK SIDE MENU STATUS
    if ("true" == localStorage.getItem("MENU_OPENED")) {     
        $("#player").css({zIndex: "998"});
        $("#header").css({zIndex: "999"});
        $("#menu-search").focus();
        $("#menu").removeClass("slide-in");
        $("#menu").addClass("mclick");
        $(".menu-icon").addClass("menu-icon-open");
        sideMenuResponsive();
        $("#items").scrollTop(localStorage.getItem("menuScrollPosition"));
    }
    //REMOVE SCROLLBAR FROM PLAYER
    $("#ciframe").attr("scrolling", "no");

    //ANALYTICS
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
    (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
    m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');
    ga('create', 'UA-41210250-1', 'auto');
    ga('send', 'pageview');
});

//REMOVE LOCAL CACHE ON NEW VERSION OR EVENT
if ( (typeof localStorage.VERSION != 'undefined' && localStorage.VERSION != VERSION ) || (typeof localStorage.VERSION != 'undefined' && localStorage.EVENT !== EVENT && ACTIVE =="tv") ) {
    localStorage.setItem("VERSION", VERSION);
    localStorage.setItem("EVENT", EVENT);
    window.location.reload(true);
}

//CLOSE AD
$("#close-ad").click(function() {
    $("#float-layer").css({opacity: "0"});
    $(".player-container-tv").css({
    'filter'         : 'blur(0px)',
    '-webkit-filter' : 'blur(0px)',
    '-moz-filter'    : 'blur(0px)',
    '-o-filter'      : 'blur(0px)',
    '-ms-filter'     : 'blur(0px)'
    });  
    setTimeout(function() {$("#float-layer").css({display: "none"});}, 500);
});

//FACEBOOK SHARE POP-UP
$(".share-facebook").click(function() {
    window.open('http://www.facebook.com/share.php?u='+window.location.href, 'newwindow', 'width=300, height=250')
    return false;
});

//TWITTER SHARE POP-UP 
$(".share-twitter").click(function() {
    window.open('http://twitter.com/share?url='+window.location.href, 'newwindow', 'width=300, height=250');
    return false;
});

//HIDE PLAYER SHIELD
$("#shield").click(function() {
    $("#shield").hide();
    $("#player-protected").show();
    $("#player-protected").append(content);
    $("#ciframe").attr("scrolling", "no");
});

//FADEIN LOADING PLAYER
$("#player-container").css({opacity: "1"});
setTimeout(function() {
    $("#float-layer").css({opacity: "1"});
    $("#close-ad").css({opacity: "1"});
    }, 500);

//LIGHTS DOWN
$("#shadow").fadeTo(1, 0), $("#nav-lights").click(function() {
    $("#header").css({zIndex: "0"}), 
    $("#player").css({zIndex: "1"}),
    $("#float-layer").css({zIndex: "1"}),
    $("#player-protected").css({zIndex: "998"}), 
    $("#shield").css({zIndex: "998"}),
    $("#shadow").css({zIndex: "0"}), 
    $("#shadow").fadeTo(300, .9),
    $("#shadow").css({display: "block"}),
    $(".slide-in").removeClass("slide-in on").addClass("slide-in"),
    $(".menu-icon").removeClass("menu-icon-open"),
    $(".mclick").removeClass("mclick").addClass("slide-in");
    localStorage.setItem("MENU_OPENED", "false");
}); 

//LIGHTS UP
$("#shadow").click(function() {
    $("#shadow").fadeTo(300, 0), 
    $(".slide-in").removeClass("slide-in on").addClass("slide-in"), 
    setTimeout(function() {
        $("#header").css({zIndex: "981"}), 
        $("#player").css({zIndex: "980"}),
        $("#float-layer").css({zIndex: "980"}), 
        $("#shadow").css({display: "none"});
    }, 400);
});

//CONTACT SUBMIT 
$("#submit-link").click(function() {
    $("#submit").click();
});

//CONTACT MESSAGE 
$("#messageBotton").click(function() {
   document.location.href="/";
});

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
$("#menu-icon").click(function() {
    var shadowStatus = $("#shadow").css("display");
    var MENU_OPENED = ("true" == localStorage.getItem("MENU_OPENED"));
    if ( MENU_OPENED){
        $("#menu").removeClass("on");
        $("#menu").removeClass("mclick");
        $("#menu").addClass("slide-in");
        $(".menu-icon").removeClass("menu-icon-open");
        localStorage.setItem("MENU_OPENED", "false");
    }else {
        sideMenuResponsive();
        localStorage.setItem("menuScrollPosition", $("#items").scrollTop());
        localStorage.setItem("MENU_OPENED", "true");
        $(".menu-icon").addClass("menu-icon-open");
        $(".slide-in").toggleClass("on"), 
        $("#menu-search").focus(), 0 == MENU_OPENED && (
            $("#header").css({zIndex: "999"}),
            $("#player").css({zIndex: "998"})
        );
    }
});

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