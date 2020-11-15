public class Fecha{
    public String fechaLiteral(int dia, int mes, int año){
        String reporte;
        String res;
        switch (mes){
            case 1: res = "Enero"; break; 
            case 2: res = "Febrero"; break;
            case 3: res = "Marzo"; break;
            case 4: res = "Abril"; break;
            case 5: res = "Mayo"; break;
            case 6: res = "Junio"; break;
            case 7: res = "Julio"; break;
            case 8: res = "Agosto"; break;
            case 9: res = "Septiembre"; break;
            case 10: res = "Octubre"; break;
            case 11: res = "Noviembre"; break;
            case 12: res = "Diciembre"; break;
            default: res = "El mes no corresponde aun valor valido";
        }
        reporte = dia + " de " + res + " de " + año;
        return reporte;
    }
}
