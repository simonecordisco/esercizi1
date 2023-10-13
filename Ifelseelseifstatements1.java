 // Scrivere un programma che stampi i numeri da 1 a 100. Per i multipli di 3 stampi "Fizz" al posto del numero e per i multipli di 5 stampi "Buzz".
 //Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".
  
   public class MyClass {
    public static void main(String args[]) {
      double x=1;
   while(x<=100){
      System.out.println(x);
      x+=1;
        if(x%3==0){
          xMultiploDiTre();
      } else if (x%5==0) {
          xMultiploDiCinque();
      } else((x%3==0) && (x%5==0));{
          xMultiploEntrambi();
      }
      
      public static void  xMultiploDiTre(){
       System.out.println("fizz"+ x);
      }
      public static void xMultiploDiCinque(){
      System.out.println("buzz" + x);
      }
       public static void xMultiploEntrambi(){
      System.out.println("fizzbuzz" + x);
      }
   }
}
}
