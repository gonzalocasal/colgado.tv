
function setscroll() {
    var a = document.getElementById("items").scrollTop;
    localStorage.setItem("scrollpos", a);
}
function mclick() {
    var a = 1;
    localStorage.setItem("menuclick", a);
}
function send(){
    document.getElementById('boton-submit').click(); 
    return false;
}
$("#cerrar").click(function() {
    $("#floatLayer").css({
        opacity: "0"
    }), setTimeout(function() {
        $("#floatLayer").css({display: "none"});
    }, 500);
});
$("#shield").click(function() {
    $("#playerProtected").show();
    $("#shield").hide();
    $("#playerProtected").append(content);
    $("#ciframe").attr("scrolling", "no");
});
$("#cuerpo").css({opacity: "1"}), setTimeout(function() {
    $("#floatLayer").css({opacity: "1"});
}, 1e3);
$("#sombra").fadeTo(1, 0), $("#luces").click(function() {
    $("#header").css({zIndex: "997"}), 
    $("#player").css({zIndex: "998"}), 
    $("#playerProtected").css({zIndex: "998"}), 
    $("#shield").css({zIndex: "998"}),
    $("#sombra").css({display: "block"}),
    $("#sombra").fadeTo(300, .9),
    $("#floatLayer").css({zIndex: "999"}), 
    $(".slide-in").removeClass("slide-in on").addClass("slide-in"), 
    $(".mclick").removeClass("mclick").addClass("slide-in");
}); 
$("#sombra").click(function() {
    $("#sombra").fadeTo(300, 0), 
    $(".slide-in").removeClass("slide-in on").addClass("slide-in"), 
    setTimeout(function() {
        $("#player").css({zIndex: "980"}),
        $("#floatLayer").css({zIndex: "980"}), 
        $("#sombra").css({display: "none"});
    }, 400);
});
$(document).ready(function(a) {
    
    var b = localStorage.getItem("menuclick");
    
    if (1 == b) {
        document.getElementById("menu").className = "mclick";
        var c = window.innerHeight - 45, d = localStorage.getItem("scrollpos");
        $("#items").css("height", c - 70), $("#items").scrollTop(d);
    }
    
    $(document).mouseup(function(a) {
        var b = localStorage.getItem("menuclick");
        if (1 == b) {
            setTimeout(function() {
                document.getElementById("menu").className = "slide-in";
            }, 300);
            var c = 0;
            localStorage.setItem("menuclick", c);
        }
    }); 
    
    $("#menu-icon").click(function() {
        var a = $("#sombra").css("display"), b = $("#menu").hasClass("on");
        if ("block" == a) $("#sombra").fadeTo(300, 0), $("#sombra").css({
            display: "none"
        }), 
        $("#menu").removeClass("on"); else {
            var c = window.innerHeight - 45;
            $(".slide-in").toggleClass("on"), $("#items").css("height", c - 70), 
            $("#menu-search").focus(), 
            0 == b && ($("#sombra").css({
                display: "block"
            }),
            $("#sombra").fadeTo(300, .5), $("#header").css({
                zIndex: "999"
            }));
        }
    });
    $("#ciframe").attr("scrolling", "no");
});
$("#menu-icon").click(function() {
    var a = document.getElementById("menu"), b = a.className;
    "mclick" == b && (a.className = "slide-in on");
});
$(".menu-link").click(function() {
    var a = document.getElementById("items").scrollTop;
    localStorage.setItem("scrollpos", a);
    var b = 1;
    localStorage.setItem("menuclick", b);
}),
$(window).resize(function() {
    var a = window.innerHeight - 45;
    $("#items").css("height", a - 70);
}), 
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
}(jQuery), function(a, b, c, d, e, f, g) {
    a.GoogleAnalyticsObject = e, a[e] = a[e] || function() {
        (a[e].q = a[e].q || []).push(arguments);
    }, a[e].l = 1 * new Date(), f = b.createElement(c), g = b.getElementsByTagName(c)[0], 
    f.async = 1, f.src = d, g.parentNode.insertBefore(f, g);
}(window, document, "script", "/view/js/analytics.js", "ga"), ga("create", "UA-41210250-1", "colgado.tv"), 
ga("send", "pageview");