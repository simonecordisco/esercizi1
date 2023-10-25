//Scrivere un programma che contenga un metodo che sfrutti il while loop
// e prenda in ingresso 1 valore intero come limite superiore e calcoli la
// somma di tutti i valori prima del limite e la stampi a video.
//(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)

public class whilenew {
    public static void main(String args[]) {
        int x=5;
        Risultato(x);
    }

    private static void Risultato(int x) {
        int counter = 1;
        int somma = 0;
        while(counter < x){

            somma = somma + counter;

            System.out.println ("La somma e' " + somma);
            counter++;
        }
    }
}


