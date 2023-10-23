//Definisci un metodo per la divisione di 2 numeri interi che restituisca il quoziente che dovrà essere stampato.

public class MyClass {
    public static void main(String args[]) {
       int a =40;
       int b = 20;
       System.out.println("x =" + a);
       System.out.println("y =" + b);
      Quoziente(a,b);
    
    }
    
    
    
    public static void Quoziente(int x,int y){
        int resultSum = x / y;
      System.out.println("il quoziente è " + resultSum);
    }
    
}

