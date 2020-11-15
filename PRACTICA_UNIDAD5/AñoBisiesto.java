public class AñoBisiesto{
    public String bisiesto(int año){
         String reporte;
         if (año%4 == 0 && año%100 != 0 || año%400 == 0){
             reporte = "El año es bisiesto";
         }else{
             reporte = "El año no es bisiesto";
         }
         return reporte;
     }
}
