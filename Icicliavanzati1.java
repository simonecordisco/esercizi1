//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.

public class MyClass {
    public static void main(String args[]) {
      for(int x= 0; x<=5; x++){
        if(x==5){
          break;
         
       }
         System.out.println(x);
      }
     
    }
}