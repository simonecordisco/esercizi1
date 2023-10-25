public class opcomparazione2new {
    public static void main(String args[]) {
        char a = 'a' ;
        char b = 'b';
        System.out.println(a);
        System.out.println(b);
        comparazione(a,b);
    }
    public static void comparazione(char x, char y) {
        boolean equals = x==y;

        System.out.println(" i caratteri sono " + equals);
    }
}
