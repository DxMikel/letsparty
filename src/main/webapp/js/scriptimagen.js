/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$("document").ready(obtenerIdBar);
var imagenes = document.getElementById("imagenes");
var idBar = "";
function obtenerIdBar() {
    if (localStorage.getItem("idBar") !== null) {
        idBar = localStorage.getItem("idBar");
        //window.location.replace("http://localhost:8080/LetsParty/api/imagenes/" + datos.id_bar);
        consultarImagenes(idBar);

    } else {
        alert("Hubo un error al intentar obtener el id");
    }
}

function consultarImagenes(idBar) {
    var request = new XMLHttpRequest();
    //console.log("hola");
    request.onreadystatechange = function () {
        if (this.readyState === 4) {
            if (this.status === 200) {
                var respuesta = this.responseText;
                //console.log(respuesta);
                parsearImagen(respuesta);
                //consultarDatosBar(idBar);
            }
        }
    };
    var url = 'http://localhost:8080/LetsParty/api/imagenes/' + idBar;
    console.log("el id de bar es: " + idBar);

    //console.log(url);
    request.open('GET', url, true);
    request.send();
}
//consultarBares();

function parsearImagen(datos) {
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

function cambiarVista(imagen) {
    const imgLogo = document.querySelector("#imgLogo");
    const imgMenu = document.querySelector(".menuImg");
    var contador = 0;
    //console.log("si funciona hasta aqui");
    //imgLogo.src = imagen.url
    console.log(imagen.url);
    if (imagen.tipo_imagen === "logo") {
        imgLogo.src = imagen.url;
        //imgLogo.className = "encabezado";
    }
    if (imagen.tipo_imagen === "menu") {
        imgMenu.src = imagen.url;
    }
    //localStorage.removeItem("idBar");
    infoBar(idBar);
}

function infoBar(idBar) {
    var request = new XMLHttpRequest();
    //console.log("hola");
    request.onreadystatechange = function () {
        if (this.readyState === 4) {
            if (this.status === 200) {
                var respuesta = this.responseText;
                //console.log(respuesta);
                parsearInfo(respuesta);
                //consultarDatosBar(idBar);
            }
        }
    };
    var url = 'http://localhost:8080/LetsParty/api/bares/consulta/' + idBar;
    //console.log("el id de bar es: " +idBar);

    //console.log(url);
    request.open('GET', url, true);
    request.send();
}

function parsearInfo(datosBar) {
    var bares = JSON.parse(datosBar);
    //console.log("hola2");
    //console.log(imagenes);
    for (i = 0; i < bares.length; i++) {
        var bar = bares[i];
        //console.log(recipe);
        //mostrarImagen(imagen);
        cambiarInfo(bar);
    }
}

function cambiarInfo(bar) {
    const nombreBar = document.querySelector(".nombreBar");
    const descripcionBar = document.querySelector(".descripcionBar");
    
    nombreBar.innerText = bar.nombre;
    
    descripcionBar.innerText = bar.descripcion;
}