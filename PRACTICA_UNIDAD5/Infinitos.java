public class Infinitos{
    public int primerDigito(int num){
        int primerDigito;
        int digitos = 0;
        int base = num;
        while (base != 0){
            base = base/10;
            digitos++;
        }
        
        primerDigito = (int)(num/Math.pow(10, digitos-1));
        return primerDigito;
    }
}
