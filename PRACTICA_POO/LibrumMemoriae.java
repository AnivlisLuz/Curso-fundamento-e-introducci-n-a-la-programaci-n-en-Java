public class LibrumMemoriae{
    private String tareaActual;
    private boolean concluido;
    private int contador;

    public LibrumMemoriae(String tarea){
        tareaActual = tarea;
        concluido = false;
        contador = 0;
    }

    public String anotarTarea(String nuevaTarea){
        String reporte;
        if (concluido){
            tareaActual = nuevaTarea;
            reporte = "Nueva Tarea Asignada";
            concluido = false;
        }else{
            reporte = "La tarea en curso aun no ha sido concluida";
        }
        return reporte;
    }
    
    public void concluirTarea(){
        contador++;
        concluido = true;
    }

    public int getContador(){
        return contador;
    }

    public String getTarea(){
        return tareaActual;
    }
}
