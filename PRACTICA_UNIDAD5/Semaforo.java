public class Semaforo{
    private String estadoActual;
    public Semaforo (String estado){
        estadoActual = estado;
    }
    
    public void cambiarEstado(){
        if(estadoActual == "Verde"){
            estadoActual= "Amarillo";
        }else if(estadoActual == "Amarillo"){
            estadoActual = "Rojo";
        }else{
            estadoActual = "Verde";
        }
    }  
}