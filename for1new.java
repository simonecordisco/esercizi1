//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca la tabellina
// aritmetica di quel numero che dovrà essere stampata a video.

public class for1new {
    public static void main(String args[]) {
          int a = 3;
        System.out.println("la tabellina del " + a);
          Tabellina(a);

    }
    private static void Tabellina(int a) {
        for (int y = 0; y <= 10; y++) {
            int s = a * y;
            System.out.println(s);
        }
    }
    }
