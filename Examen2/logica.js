/*function go(color, tam, rep){

}

/*function draw() {
    var canvas = document.getElementById('canvas');
    var ctx = canvas.getContext('2d');
      // Triángulo rellenado
      var pointSize = 3; // Cambia el tamaño del punto
  
      ctx.fillStyle = "#ff2626"; // Color rojo
  
      ctx.beginPath(); // Iniciar trazo
      ctx.arc(0, 0, pointSize, 0, Math.PI * 2, true); // Dibujar un punto usando la funcion arc
      ctx.arc(8, 8, pointSize, 0, Math.PI * 2, true); // Dibujar un punto usando la funcion arc
      ctx.arc(16,16, pointSize, 0, Math.PI * 2, true); // Dibujar un punto usando la funcion arc
      ctx.fill(); // 
}*/
/*
$("#canvas").click(function(e){
    getPosition(e); 
});

var pointSize = 100;

function getPosition(event){
    var rect = canvas.getBoundingClientRect();
    var x = event.clientX - rect.left;
    var y = event.clientY - rect.top;
       
    drawCoordinates(x,y);
}*/

function drawCoordinates( ){	
     var can = document.getElementById("canvas");
     var c = can.getContext("2d");
     c.beginPath();
     c.arc(200,220,200,0,Math.PI*2);
     c.fillStyle = "green";
     c.fill();
}