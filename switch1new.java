//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e
//restituisca il nome del giorno della settimana come stringa
// una stringa di errore nel caso di valore maggiore di 7 o minore di 1.
public class switch1new {
    public static void main(String args[]) {
        int x = 8;
        switch(x){
            case 1:
                lunedi();
                break;
            case 2:
                martedi();
                break;
            case 3:
                mercoledi();
                break;
            case 4:
                giovedi();
                break;
            case 5:
                venerdi();
                break;
            case 6:
                sabato();
                break;
            case 7:
                domenica();
                break;
            default:
                errore();
        }
    }
    public static void lunedi(){
        System.out.println("lunedi");
    }
    public static void martedi(){
        System.out.println("martedi");
    }
    public static void mercoledi(){
        System.out.println("mercoledi");
    }
    public static void giovedi(){
        System.out.println("giovedi");
    }
    public static void venerdi(){
        System.out.println("venerdi");
    }
    public static void sabato(){
        System.out.println("sabato");
    }
    public static void domenica(){
        System.out.println("domenica");
    }
    public static void errore(){
        System.out.println("errore");
    }
}

