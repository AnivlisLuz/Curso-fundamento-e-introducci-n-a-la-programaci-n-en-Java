public class Somnia{
    private int alcanceViOp;
    private int durabilidad;
    private int contadorOb;

    public Somnia(){
        alcanceViOp = (int)(Math.random()*100)+1;
        durabilidad = (int)(Math.random()*100)+1;
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

    public String combinarModulos(Somnia modulo1, Somnia modulo2){
        String reporte;
        int alcanceViOp = modulo1.alcanceViOp + modulo2.alcanceViOp;
        int durabilidad = Math.min (modulo1.durabilidad, modulo2.durabilidad);
        reporte = "Alcance de Visió Optimo = "+alcanceViOp+", durabilidad = "+ durabilidad;
        return reporte;
    }
}
