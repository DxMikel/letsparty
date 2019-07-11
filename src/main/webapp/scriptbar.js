/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$("document").ready(consultarBares());
var bares = document.getElementById("bares");
var some = document.getElementById("some");
function consultarBares() {
    var request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if (this.readyState === 4) {
            if (this.status === 200) {
                var respuesta = this.responseText;
                //console.log(respuesta);
                parsearbares(respuesta);
            }
        }
    };
    var url = 'http://localhost:8080/LetsParty/api/bares';

    //console.log(url);
    request.open('GET', url, true);
    request.send();
}
//consultarBares();

function parsearbares(datos) {
    var bares = JSON.parse(datos);

    //console.log(bares);
    for (i = 0; i < bares.length; i++) {
        var bar = bares[i];
        //console.log(recipe);
        mostrarBar(bar);
    }
}

function mostrarBar(datos){
    var divContenedor = document.createElement('div');
    var imgBar = document.createElement('img');
    var divCuerpoCard = document.createElement('div');
    var nombreBar = document.createElement('h5');
    var descripcionBar = document.createElement('p');
    var abiertoBar = document.createElement('p');
    var cerradoBar = document.createElement('p');
    
    divContenedor.className = "card mb-3 col-sm-4 primerFila " + datos.id_bar;
    divContenedor.onclick = function(){
        alert("el id del bar es: " + datos.id_bar);
    };
    
    imgBar.src=datos.imagen;
    imgBar.className = "imagen card-img-top";
    
    divCuerpoCard.className = "card-title";
    
    nombreBar.innerText = datos.nombre;
    nombreBar.className= "card-text";
    descripcionBar.innerText = "Descripcion: " +datos.descripcion;
    descripcionBar.className = "card-text";
    abiertoBar.innerText = "Horario de apertura: " + datos.horario_abierto;
    abiertoBar.className = "card-text";
    cerradoBar.innerText = "Horario de cierre: " + datos.horario_cerrado;
    cerradoBar.className = "card-text";
    
    divCuerpoCard.appendChild(nombreBar);
    divCuerpoCard.appendChild(descripcionBar);
    divCuerpoCard.appendChild(abiertoBar);
    divCuerpoCard.appendChild(cerradoBar);
    
    divContenedor.appendChild(imgBar);
    divContenedor.appendChild(divCuerpoCard);
    some.appendChild(divContenedor);
}

function moostrarBar(datos) {
    var liElemento = document.createElement('li');
    var divContenedor = document.createElement('div');
    var imgBar = document.createElement('img');
    var nombre = document.createElement('h4');
    var descripcion = document.createElement('h3');
    var horario = document.createElement('h3');
    var horario1 = document.createElement('h3');

    imgBar.src = datos.imagen;
    imgBar.width = 50;
    imgBar.heigth = 50;

    //console.log(imgBaar);
    //imgBaar.appendChild(imgBar);

    nombre.innerText = datos.nombre;
    descripcion.innerText = datos.descripcion;
    horario.innerText = datos.horario_abierto;
    horario1.innerText = datos.horario_cerrado;

    divContenedor.appendChild(imgBar);
    divContenedor.id = datos.id_bar;
    divContenedor.appendChild(nombre);
    divContenedor.appendChild(descripcion);
    divContenedor.appendChild(horario);
    divContenedor.appendChild(horario1);

    //liElemento.appendChild(divContenedor);
    imgBaar.appendChild(divContenedor);
}

