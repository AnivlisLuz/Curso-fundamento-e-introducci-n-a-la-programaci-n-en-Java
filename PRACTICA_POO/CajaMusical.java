public class CajaMusical{
    private String cancion1;
    private String cancion2;
    private String cancion3;
    private boolean estado;

    public CajaMusical(String cancion1, String cancion2, String cancion3){
        this.cancion1 = cancion1;
        this.cancion2 = cancion2;
        this.cancion3 = cancion3;
        estado = false;
    }

    public String reproducirCancion(){
        String cancion = cancion1;
        String reporte;
        if (estado == false){
            reporte = "La canción ha empezado a sonar";
            estado = true;
        }else{
            reporte = "Ya esta sonando una canción";
        }
        return reporte;
    }

    public String pausarCancion(){
        String cancion = cancion1;
        String reporte;
        if (estado){
            reporte = "La canción ha sido Pausada";
            estado = false;
        }else{
            reporte = "La canción ya se encuentra en Pausa";
        }
        return reporte;
    }
    
    public void cambiarCancion(String nextCancion){
        cancion1 = nextCancion;
    }

    public String getNombre(){
        String cancion = cancion1;
        return cancion;
    }
}
