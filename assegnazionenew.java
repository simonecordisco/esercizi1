////Scrivi un programma che contiene un metodo che date due variabili le incrementi
// di un valore scelto da te e le moltiplichi fra di loro.
////Il metodo dovrà restituire il risultato dell'operazione che dovrà essere
// stampato a video.
public class assegnazionenew {
    public static void main(String args[]) {
        int a=2;
        int b=2;
        System.out.println(a);
        System.out.println(b);
       assegnazione(a,b);
    }
    public static void assegnazione(int x,int y){
        x = x + 2;
        y = y + 2;
        int z=x*y;

        System.out.println(z);
    }

}
