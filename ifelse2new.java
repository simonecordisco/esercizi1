//Scrivi un programma che calcoli la lunghezza di una stringa, sulla base di questa lunghezza stampi "Lunghezza maggiore di 10",
// "Lunghezza minore di 10" o "Lunghezza pari a 10".
public class ifelse2new {
    public static void main(String args[]) {
        String nome ="simoneeeee";
        int lunghezza = nome.length();
        if(lunghezza<10){
            System.out.println("lunghezza stringa minore di 10");
        }else if(lunghezza>10){
            System.out.println("lunghezza stringa maggiore di 10 ");
        }else{
            System.out.println("lunghezza stringa uguale a 10 ");
        }
    }
}
