public class Alhandal{
    public String cantMonedad(){
        int cant10 = 2;
        int cant5 = (50 - 25 * cant10)/11;
        int cant1 = 28 - 10 * cant10 - 5 * cant5;
        return cant1 + " monedas de 1 Bs, " + cant5 + " monedas de 5 Bs, " + cant10 + " monedas de 10 Bs.";
    }
}
