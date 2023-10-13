//Scrivi un programma che contenga un metodo che prende in ingresso un carattere e ne identifica il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
//Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.
public class MyClass {
    public static void main(String args[]) {
     char x = '+';
     switch(x){
         case '+':
             addizione();
             break;
         case '-':
             sottrazione();
             break;
         case '*':
             moltiplicazione();
             break;        
         case '/':
             divisione();
             break;     
         default:
         errore();
     }
    }
     public static void addizione(){
      System.out.println("addizione");
    }
     public static void sottrazione(){
      System.out.println("sottrazione");
    }
     public static void moltiplicazione(){
      System.out.println("moltiplicazione");
    }
     public static void divisione(){
      System.out.println("divisione");
    }
      public static void errore(){
      System.out.println("errore");
    }
}