public class ComplejoTuristico{
    private String nombre;
    private int edad;
    private int listaClientes;
    private int listaEspera;
    
    public ComplejoTuristico(int clientes, int espera){
        nombre = "";
        edad = 0;
        listaClientes = clientes;
        listaEspera = espera;
    }
    
    public String registrar(String nombre, int edad ){
        if (listaClientes != 0){
            //registro en lista de clientes
        }else{
            // registro en lista de espera
        }
        return "";
    }
    
    public String salir(){
        // espacio en lista de clientes
        // tomar a la primera persona de lista de espera
        return "";
    }
}
