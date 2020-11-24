public class Crecimiento{
    public String crecimiento (int num){
        String reporte;
        int primerDigito = num/100;
        int segundoDigito = num/10 % 10;
        int tercerDigito = num % 10;
        if(primerDigito < segundoDigito && primerDigito < tercerDigito && segundoDigito < tercerDigito){
            reporte = num + " es un número en crecimiento";
        }else{
            reporte = num + " no es un número en crecimiento";
        }
        
        return reporte;
    }
}
