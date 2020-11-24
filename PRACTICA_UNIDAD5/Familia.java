public class Familia{
    private String hijo1;
    private String hijo2;
    private String hijo3;
    private int edad1;
    private int edad2;
    private int edad3;
    public Familia (String h1,int e1,String h2,int e2,String h3,int e3){
        hijo1 = h1;
        edad1 = e1;
        hijo2 = h2;
        edad2 = e2;
        hijo3 = h3;
        edad3 = e3;
    }

    public String informe (){
        String reporte;
        if (edad1 > edad2 && edad1 > edad3){
            if (edad2 > edad3){
                reporte = hijo1 + " es el mayor, " + hijo2 + " es el del medio y " + hijo3 + " es el menor.";
            }else{
                reporte = hijo1 + " es el mayor, " + hijo3 + " es el del medio y " + hijo2 + " es el menor.";
            }
        }else if(edad2 > edad3 && edad2 > edad1){
            if(edad3 > edad1){
                reporte = hijo2 + " es el mayor, " + hijo3 + " es el del medio y " + hijo1 + " es el menor.";
            }else{
                reporte = hijo2 + " es el mayor, " + hijo1 + " es el del medio y " + hijo3 + " es el menor.";
            }   
        }else{
            if(edad2 > edad1){
                reporte = hijo3 + " es el mayor, " + hijo2 + " es el del medio y " + hijo1 + " es el menor.";
            }else{
                reporte = hijo3 + " es el mayor, " + hijo1 + " es el del medio y " + hijo2 + " es el menor.";
            }
        }
        return reporte;
    }
}