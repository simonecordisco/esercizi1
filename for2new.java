//Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero
//di risultati che vuoi avere e stampi tutti i numeri naturali in ordine inverso (Quindi se passo il punto di partenza
// a 6 e gli dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).
public class for2new {
    public static void main(String args[]) {
        int a = 6;
        int b = 3;                ;
        Risultato(a, b);
    }

    private static void Risultato(int x, int y) {
        for (int i = 0; i < y; i++) {
            System.out.println(x);
             x--;
        }
    }
}
