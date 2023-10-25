//Scrivi un programma che contenga un metodo che prende in ingresso un carattere e ne identifica il tipo per un operazione di algebra
// (+ addizione - sottrazione * moltiplicazione / divisione).
//Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.

public class switch2new {
    public static void main(String args[]) {
        char segno = '-';
    Operazione(segno);


    }
    public static void Operazione(char segno){
        switch(segno){
            case '+':
                System.out.println(segno + " il tipo di operazione è addizione");
                break;
            case '-':
                System.out.println(segno + " il tipo di operazione è sottrazione ");
                break;
            case '*':
                System.out.println(segno + " il tipo di operazione è moltiplicazio ");
                break;
            case '/':
                System.out.println(segno + " il tipo di operazione è divisione");
                break;
            default:
                System.out.println("errore");

        }

    }
}
