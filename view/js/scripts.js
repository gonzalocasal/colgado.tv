//ON READY
$(document).ready(function(a) {  
    //CHECK SIDE MENU STATUS
    if ("true" == localStorage.getItem("menuOpened")) {
        document.getElementById("menu").className = "mclick";
        var headerSize =  $("#header").height();
        var itemsTopPosition = $("#items").position().top;
        var currentHeight = window.innerHeight - headerSize;
        var scrollPosition = localStorage.getItem("menuScrollPosition");
        $("#items").css("height", currentHeight - itemsTopPosition), $("#items").scrollTop(scrollPosition);
    }
    //REMOVE IFRAME SCROLLING
    $("#ciframe").attr("scrolling", "no");
});

//CLOSE AD
$("#close-ad").click(function() {
    $("#float-layer").css({opacity: "0"});
    setTimeout(function() {$("#float-layer").css({display: "none"});}, 500);
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
setTimeout(function() {$("#float-layer").css({opacity: "1"});}, 500);

//LIGHTS DOWN
$("#shadow").fadeTo(1, 0), $("#lights").click(function() {
    $("#header").css({zIndex: "997"}), 
    $("#player").css({zIndex: "998"}), 
    $("#player-protected").css({zIndex: "998"}), 
    $("#shield").css({zIndex: "998"}),
    $("#shadow").css({display: "block"}),
    $("#shadow").fadeTo(300, .9),
    $("#float-layer").css({zIndex: "999"}), 
    $(".slide-in").removeClass("slide-in on").addClass("slide-in"), 
    $(".mclick").removeClass("mclick").addClass("slide-in");
}); 

//LIGHTS UP
$("#shadow").click(function() {
    $("#shadow").fadeTo(300, 0), 
    $(".slide-in").removeClass("slide-in on").addClass("slide-in"), 
    setTimeout(function() {
        $("#player").css({zIndex: "980"}),
        $("#float-layer").css({zIndex: "980"}), 
        $("#shadow").css({display: "none"});
    }, 400);
});

//CONTACT SUBMIT 
$("#submitLink").click(function() {
    $("#submit").click();
});

//CONTACT MESSAGE 
$("#messageBotton").click(function() {
   document.location.href="/";
});

//SIDE MENU ICON CLICK
$("#menu-icon").click(function() {
    var shadowStatus = $("#shadow").css("display");
    var menuOpened = $("#menu").hasClass("on");
    if ("block" == shadowStatus)
        $("#shadow").fadeTo(300, 0), $("#shadow").css({display: "none"}), 
        $("#menu").removeClass("on");
    else {
        var headerSize =  $("#header").height();
        var itemsTopPosition = $("#items").position().top;
        var menuHeight = window.innerHeight - headerSize;
        $(".slide-in").toggleClass("on"), $("#items").css("height", menuHeight - itemsTopPosition), 
        $("#menu-search").focus(), 0 == menuOpened && (
            $("#shadow").css({display: "block"}),
            $("#shadow").fadeTo(300, .5), 
            $("#header").css({zIndex: "999"})
        );
    }
});

//HIDE SIDE MENU
$(document).mouseup(function(a) {
    if ("true" == localStorage.getItem("menuOpened")) {
        setTimeout(function() {$("#menu").attr("class","slide-in");}, 300);
        localStorage.setItem("menuOpened", "false");
    }
}); 

//SIDE MENU ITEMS CLICK
$(".menu-link").click(function() {
    localStorage.setItem("menuScrollPosition", $("#items").scrollTop());
    localStorage.setItem("menuOpened", "true");
}),

//SIDE MENU VERTICAL RESPONSIVE
$(window).resize(function() {
    var headerSize =  $("#header").height();
    var itemsTopPosition = $("#items").position().top;
    var menuHeight = window.innerHeight - headerSize;
    $("#items").css("height", menuHeight - itemsTopPosition);
}),

//SEARCH IN SIDE MENU
function(a) {
    function b(b, c) {
        a("#menu-search").change(function() {
            var b = a(this).val();
            return b ? (a("#items").find("a:not(:Contains(" + b + "))").parent().fadeOut(), 
            a("#items").find("a:Contains(" + b + ")").parent().fadeIn()) : a("#items").find("li").fadeIn(), 
            !1;
        }).keyup(function() {
            a(".menu-separator").css("display", "none"), a(this).change();
        });
    }
    jQuery.expr[":"].Contains = function(a, b, c) {
        return (a.textContent || a.innerText || "").toUpperCase().indexOf(c[3].toUpperCase()) >= 0;
    }, a(function() {
        b(a("#list"), a("#items"));
    });
}
