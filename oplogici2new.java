//Scrivi un programma che contiene un metodo che prenda un numero in ingresso e capisca
// se un numero è pari o dispari utilizzando solo gli operatori logici.
public class oplogici2new {
    public static void main(String args[]) {
        int a = 10;
        System.out.println(  pari(a));
        System.out.println( Dispari(a));

    }
    public static boolean pari(int x) {

        return x % 2 == 0;


    }
    public static boolean Dispari(int x) {

        return x % 2 != 0;


    }
}
