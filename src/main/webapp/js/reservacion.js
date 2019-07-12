var messagesWaiting = false;
function getMessages() {
    if (!messagesWaiting) {
        messagesWaiting = true;
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                messagesWaiting = false;
                var contentElement = document.getElementById("contenido");
                contentElement.innerHTML = xmlhttp.responseText + contentElement.innerHTML;
            }
        }
        xmlhttp.open("GET", "regreservacion?t=" + new Date(), true);
        xmlhttp.send();
    }
}
setInterval(getMessages, 1000);
function postMessage() {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", "regreservacion?t=" + new Date(), false);
    xmlhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    var fechaReservacion = escape(document.getElementById("fecha_reservacion").value);
    var personasNumero = escape(document.getElementById("personasNumero").value);
    var hora = escape(document.getElementById("hora").value);
    document.getElementById("mensajerecibido").value = "";
    xmlhttp.send("fecha_reservacion=" + fechaReservacion + "&personasNumero=" + personasNumero + "&hora=" + hora);
}
