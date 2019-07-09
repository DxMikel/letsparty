/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var bares = document.getElementById("bares");
$("document").ready(consultarBares());
function consultarBares(){
    var request = new XMLHttpRequest();
    console.log("hola");
    request.onreadystatechange = function(){
      if (this.readyState === 4){
          if(this.status === 200){
              var respuesta = this.responseText;
              //console.log(respuesta);
              parsearbares(respuesta);
          }
      }  
    };
    var url='http://localhost:8080/letsparty/api/bares';
    
    console.log(url);
    request.open('GET',url , true);
    request.send();
}
//consultarBares();

function parsearbares(datos){
    var bares = JSON.parse(datos);
    console.log("hola2");
    console.log(bares);
    for(i=0; i < bares.length; i++){
        var bar = bares[i];
        //console.log(recipe);
        mostrarBar(bar);
    }
}
function mostrarBar(datos){
    console.log("hola4");
    var liElemento = document.createElement('li');
    var divContenedor = document.createElement('div');
   // var imgbar = document.createElement('img');
    var nombre = document.createElement('h4');
    var descripcion = document.createElement('h3');
    var horario = document.createElement('h3');
    var horario1 = document.createElement('h3');
    console.log("hola5");
    
   // imgBar.src = datos.image_url;
   // imgBar.width = 50;
   // imgBar.heigth=50;
    
    nombre.innerText = datos.nombre;
    descripcion.innerText = datos.descripcion;
    horario.innerText = datos.horario_abierto;
    horario1.innerText = datos.horario_cerrado;
    
    
  
   console.log("hola6");
    
    divContenedor.id = datos.id_bar;
    divContenedor.appendChild(nombre);
    divContenedor.appendChild(descripcion);
    divContenedor.appendChild(horario);
    divContenedor.appendChild(horario1);
    //divContenedor.appendChild(imgBar);
    
    console.log("hola7");
    liElemento.appendChild(divContenedor);
    listaBares.appendChild(liElemento);
}

