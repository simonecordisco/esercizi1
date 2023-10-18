public class MyClass {
    public static void main(String arg[]){
        int[] a = {1,1,2,2,3,3};
        int[] b = new int[a.length];
        newArray (a,b);
        }
        public static void newArray(int[]a, int[]b){
            int s=0;
            System.out.println("i duplicati sono :");
        for(int i = 0 ; i<a.length ; i++){
            boolean dup =false;
            for(int x=0 ; x<b.length;x++){
                if(a[i]==b[x]){
                    dup = true;
                    break;
                }
            }
            if(!dup){
                b[s]= a[i];
                s++;
            }
        }
        for(int i = 0; i < s; i++){
            System.out.print(" " + b[i]);
        }
}
}
