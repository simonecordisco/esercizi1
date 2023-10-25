public class aritmentici3new {
    public static void main(String args[]) {
        int a =4;
        int b = 2;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        daMoltiplicare(a,b);
    }
    public static void daMoltiplicare(int x,int y){
        x=x+2;
        y=y+4;
        int resultSum = (x*y);
        System.out.println("x =" + x);
        System.out.println("y =" + y);
        System.out.println("risultato " + resultSum);
    }
}
