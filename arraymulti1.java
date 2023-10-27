//scrivere un programma che contenga un metodo che permette di inizializzare una matrice riempita con dei valori a vostro
// piacimento e restituisca la somma degli elementi sulla prima riga
public class arraymulti1 {
    public static void main(String args[]){
      int [][]array={{2,2,3},{4,5,6}};
      sommaArray(array);
    }
    public static int sommaArray(int[][]array){
         int risultato = 0;
        for(int i= 0; i<array[0].length; i++){

           System.out.print(" [" + i + "] =" + array[0][i]);
            risultato=risultato+array[0][i];


        }
        System.out.println(" "+risultato);
        return risultato;
    }
}