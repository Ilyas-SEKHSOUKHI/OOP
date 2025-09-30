public class Boucle {
    public static void main (String[] args){
        int x =10;
        //Break
        for(int i=0;i<10;i++){
            x--;
            if(x==5)break;
        }
        System.out.println(x);
        //Continue
        for(int i=0;i<10;i++){
            if(i==5) continue;
            System.out.println(x);
        }
    }
}// A Reviser
