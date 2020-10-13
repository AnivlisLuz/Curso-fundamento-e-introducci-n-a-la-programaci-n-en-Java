public class TanqueAgua{
    public double calcularTiempo(){
        double tiempoChorro = 10;
        double tiempoDesague = 15;
        double tiempoLlenado = 1/tiempoChorro - 1/tiempoDesague;
        return tiempoLlenado;
    }
}
