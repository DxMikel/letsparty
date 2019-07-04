const http = new XMLHttpRequest();
const url = "http://localhost:8080/LetsParty/logout";

$.get("navbar.html", function(data){
        $("#nav-placeholder").replaceWith(data);
});