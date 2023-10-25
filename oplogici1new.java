//Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore di confronto
//verifichi se il numero di confronto è compreso tra due valori specifici e stampi il risultato dell'operazione
// comprensivo dei due limiti (inferiore e superiore)

public class oplogici1new {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a);
        System.out.println(b);
        logici(a,b,c);
    }

    public static void logici(int x, int y, int z) {
        boolean s =(z > x) && (z < y);

        System.out.println(s);

    }
}
