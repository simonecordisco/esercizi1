//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e
// stampa tutti i numeri fino al
// valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.
public class icicli1new {
    public static void main(String args[]) {
        int a = 2;
        Ciclo(a);
    }
    private static void Ciclo(int a) {
        for(int x= a; x<=5; x++){
            if(x==5){
                break;

            }
            System.out.println(x);
        }
    }
}


