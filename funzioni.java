public class funzioni {
    public static void main(String args[]) {
        String nome = "simone";
        var lunghezza = nome.length();
        lunghezza(nome);
        System.out.print(nome);
    }

    public static void lunghezza(String nome) {

        var lunghezza = nome.length();
        System.out.println("la lunghezza è " + lunghezza);
    }
}