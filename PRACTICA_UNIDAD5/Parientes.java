public class Parientes{
   public String esPariente(int num1, int num2){
       String reporte;
       if (num1/num2 >=1 && num1%num2==0 || (num2/num1)>=1 && num2%num1==0){
           reporte = "Son parientes";
       }else{
           reporte = "No son pariente";
       }
       return reporte;
   }
}
