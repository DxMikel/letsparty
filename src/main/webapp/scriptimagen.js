/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var imagenes = document.getElementById("imagenes");
$("document").ready(consultarImagenes());
function consultarImagenes(){
    var request = new XMLHttpRequest();
    console.log("hola");
    request.onreadystatechange = function(){
      if (this.readyState === 4){
          if(this.status === 200){
              var respuesta = this.responseText;
              //console.log(respuesta);
              parsearImagen(respuesta);
          }
      }  
    };
    var url='http://localhost:8080/letsparty/api/imagenes';
    
    console.log(url);
    request.open('GET',url , true);
    request.send();
}
//consultarBares();

function parsearImagen(datos){
    var imagenes = JSON.parse(datos);
    console.log("hola2");
    console.log(imagenes);
    for(i=0; i < imagenes.length; i++){
        var imagen = imagenes[i];
        //console.log(recipe);
        mostrarImagen(imagen);
    }
}
function mostrarImagen(datos){
    console.log("hola4");
    var liElemento = document.createElement('li');
    var divContenedor = document.createElement('div');
  var imgImagen = document.createElement('img');
  var tipo = document.createElement('h3');
  

    console.log("hola5");
    
      imgImagen.src = datos.url;
   imgImagen.width = 50;
   imgImagen.heigth=50;
tipo.innerText = datos.tipo_imagen;
    
    divContenedor.id = datos.id_imagen_bar;
    divContenedor.appendChild(imgImagen);
    divContenedor.appendChild(tipo);
    
    console.log("hola7");
    liElemento.appendChild(divContenedor);
    listaImagen.appendChild(liElemento);
}

