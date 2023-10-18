//Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10 e che che 
//calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.
public class MyClass {
    public static void main(String args[]) {
    int[]a = new int[10];
    sommaArray(a);
    }
     public static int sommaArray(int[]a){
        int risultato = 0;
        for(int i = 0; i < 10; i++){
            a[i]= i + 1 ;
            risultato +=a[i];
            System.out.print(" " + a[i] + " ");
        }
        System.out.println("la somma dei valori è " + risultato);
        return risultato;
    }
}