public class Insomnio{
    public int calcTiempo(){
        int horasDuerme = 2;
        int minDuerme = 45;
        int horasDespierta = 11;
        int minDespierta = 25;
        int minTotalDuerme = horasDuerme * 60 + minDuerme;
        int minTotalDespierta = horasDespierta * 60 + minDespierta;
        int tiempoDuerme = minTotalDespierta - minTotalDuerme;
        return tiempoDuerme;
    } 
}
