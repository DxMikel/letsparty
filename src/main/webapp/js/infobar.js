$("document").ready(obtenerIdBar);
var imagenes = document.getElementById("imagenes");
var idBar = "";
function obtenerIdBar() {
    if (localStorage.getItem("idBar") !== null) {
        idBar = localStorage.getItem("idBar");
        //window.location.replace("http://localhost:8080/LetsParty/api/imagenes/" + datos.id_bar);
        consultarInfoBar(idBar);
        
    } else {
        alert("Hubo un error al intentar obtener el id");
    }
}

function consultarInfoBar(idBar) {
    var request = new XMLHttpRequest();
    //console.log("hola");
    request.onreadystatechange = function () {
        if (this.readyState === 4) {
            if (this.status === 200) {
                var respuesta = this.responseText;
                //console.log(respuesta);
                parsearInfo(respuesta);
            }
        }
    };
    var url = 'http://localhost:8080/LetsParty/api/bares/consulta/' + idBar;

    //console.log(url);
    request.open('GET', url, true);
    request.send();
}

function parsearInfo(datos) {
    var imagenes = JSON.parse(datos);
    //console.log("hola2");
    //console.log(imagenes);
    for (i = 0; i < imagenes.length; i++) {
        var imagen = imagenes[i];
        //console.log(recipe);
        //mostrarImagen(imagen);
        cambiarVista(imagen);
    }
}

function cambiarVista(dato){
    const nombreBar = document.querySelector(".nombreBar");
    //imgLogo.src = imagen.url
    nombreBar.textContent = dato.nombre;
}
