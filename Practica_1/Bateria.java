public class Bateria{
    public double cantDispBateria (){
        int reducJuegos = 20;
        int reducRs = 10;
        int reducYt = 15;
        double bateriaDisp = 55 - reducJuegos/2 - reducRs/4 - (2*reducYt)/3;
        return bateriaDisp;
    }
}