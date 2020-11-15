public class JuegoDeAzar{
    private int x;
    private int y;
    private int xE;
    private int yE;
    private int intentos;

    public JuegoDeAzar(){
        x = 0;
        y = 0;
        intentos = 3;
        xE = (int)(Math.random()*11);
        yE = (int)(Math.random()*11);
    }

    public String jugar(int x, int y){
        String reporte;
        if (intentos !=0){
            if (x != xE || y != yE){
                int difX =  Math.abs(x - xE);
                int difY = Math.abs(y - yE);
                if (difX>2){
                    if (difY>2){
                        reporte = "X esta lejos, Y esta lejos";
                        intentos--;
                    }else{
                        reporte = "X esta lejos, Y esta cerca";
                        intentos--;
                    }
                }else{
                    if (difY>2){
                        reporte = "X esta cerca, Y esta lejos";
                        intentos--;
                    }else{
                        reporte = "X esta cerca, Y esta cerca";
                        intentos--;
                    }
                }
            } else{
                reporte = "Ganaste!!! Aquí esta tu tesoro";
            }
        }else{
            reporte = "Lo siento, perdiste, me saludas al Megalodon";
        }
        return reporte;
    }

    public void reiniciarJuego(){
        x = 0;
        y = 0;
        xE = (int)(Math.random()*11);
        yE = (int)(Math.random()*11);
        intentos = 3;
    }
}
