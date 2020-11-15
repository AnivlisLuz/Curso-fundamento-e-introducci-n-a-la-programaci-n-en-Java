public class Somnia{
    private int alcanceViOp;
    private int durabilidad;
    private int contadorOb;

    public Somnia(int alcance, int durabilidad){
        alcanceViOp = alcance;
        this.durabilidad = durabilidad;
        contadorOb = 0;
    }

    public String apuntar(){
        String reporte;
        int probOb = (int)(Math.random()*100)+1;
        if (probOb >= 65){
            reporte = "Objeto en Movimiento Detectado";
            contadorOb ++;
        }else{
            reporte = "El intento ha fallado";
        }
        return reporte;
    }

    public Somnia combinarModulos(Somnia modulo1, Somnia modulo2){
        Somnia modulo3;
        int alcanceViOp = modulo1.alcanceViOp + modulo2.alcanceViOp;
        int durabilidad = Math.min (modulo1.durabilidad, modulo2.durabilidad);
        modulo3 = new Somnia(alcanceViOp,durabilidad);
        return modulo3;
    }
}
