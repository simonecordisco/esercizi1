////Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri fino al
// valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.

public class icicli2new {
    public static void main(String args[]) {
        int a = 7;
        Ciclo2(a);
    }
    public static void Ciclo2(int a){
        for(int x= 0; x<=a; x++){
            if(x==5){
                continue;

            }
            System.out.println(x);
        }

    }
}
