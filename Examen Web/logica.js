function go(color,tam, rep){
    document.getElementById("contenedor").innerHTML="";
    frac(color,tam,rep);
}

function frac(color,tam,rep){
    var x=100,y=200,z=100,w=200;
    var canvas=document.getElementById("dibujarRectangulo");
    var c1=canvas.getContext("2d");
    c1.fillStyle=color;					
    //c1.fillRect(10,20,200,200);
    c1.fillRect(x,y,z,w);				
    c1.beginPath(x,y,z,0,Math.PI*2,);
    //c1.arc(110,120,100,0,Math.PI*2);
    c1.fillStyle="mediumslateblue"
    c1.fill();
    //for(x=0;x<rep;x++){
      //  cons(color,tam)
    //}
}