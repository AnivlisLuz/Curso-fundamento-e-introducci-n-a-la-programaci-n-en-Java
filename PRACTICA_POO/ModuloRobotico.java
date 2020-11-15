public class ModuloRobotico{
    private int capacidad1;
    private int capacidad2;
    private boolean estado;
    
    public ModuloRobotico(){
        capacidad1 = 0;
        capacidad2 = 0;
        estado = false;//encendido
    }
    
    public String recolectarSavia(){
        String reporte;
        if (capacidad1<=90){
            capacidad1++;
            reporte = "La acción ha sido completada con exito";
        }else{
            reporte = "No puede realizar esa acción, espacio insuficiente";
        }
        return reporte;
    }
    
    public String condensarSavia(){
        String reporte;
        if (capacidad2<=20){
            if(capacidad1>=50){
                capacidad2++;
                capacidad1= capacidad1 - 50;
                reporte = "La acción ha sido completada con exito";
            }else{
                reporte = "No puede realizar esa acción, savia insuficiente";
            }
        }else{
            reporte = "No puede realizar esa acción, espacio insuficiente";
        }
        return reporte;
    }
    
    public void retirarComponentes(){
        capacidad1 = 0;
        capacidad2 = 0;
    }
    
    public void cambiarEstado(){
        estado = true;
    }
}
