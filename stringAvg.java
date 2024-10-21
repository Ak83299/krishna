
import java.util.HashMap;
import java.util.Map;

public class stringAvg {

    public static void main(String[] args)
    {


    String k = "Geeksforgeeks";
    String j = "is";
    int  l=5;
    System.out.println(k.concat(j));
    String p = k.substring(0,l)+j+k.substring(l);
    System.out.println(p);
        
        
        //System.out.println(IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray());

        String[] sd = {"s", "20", "40", "30", "ram", "60", "40", "30"};

        Map<String,Double> mp = new HashMap<>();

        
        for(int i = 0; i < sd.length;i=i+4)
        {
         String name = sd[i];
        int s1= Integer.parseInt(sd[i+1]);
        int s2= Integer.parseInt(sd[i+2]);
        int s3= Integer.parseInt(sd[i+3]);
        double avg =(s1+s2+s3) /3 ;
        mp.put(name, avg);

        }

        Map.Entry<String,Double> s =mp.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        //Map.Entry<String ,Double> s = mp.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(s.getKey()+"="+s.getValue());
    }

    
}
