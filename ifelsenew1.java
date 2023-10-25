// Scrivere un programma che stampi i numeri da 1 a 100. Per i multipli di 3 stampi "Fizz" al posto del numero e per
// i multipli di 5 stampi "Buzz".
//Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".
public class ifelsenew1 {
    public static void main(String args[]) {
        int i = 0;
        while (i <= 100) {
            i ++;
            multiplo(i);
        }
    }

    private static void multiplo(int x) {
        if ((x % 3)==0 && (x % 5) == 0){
            System.out.println("fizzbuzz");
        }else if((x %3)==0){
            System.out.println("fizz");
        }else if((x % 5) == 0){
            System.out.println("buzz");
        }else{
            System.out.println(x);
        }
    }
}