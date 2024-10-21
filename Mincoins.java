
import java.util.Arrays;


public class Mincoins {
    public static void main(String[] args) {

    int[] a = {1,21,34,24,44};
    int amount=530;
    Arrays.sort(a);
    int Mincoins=0;
    for (int i =a.length-1; i>=0; i--) {

        int eachcoincount  = amount /a[i] ;
        amount=amount -eachcoincount*a[i];
        Mincoins = Mincoins +eachcoincount;
    }

    System.out.println("Mincoins: " + Mincoins);
    

        
    }

        
    }
    

