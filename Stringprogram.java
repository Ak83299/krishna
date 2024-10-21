
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;



public class Stringprogram {
    
     public static void main(String[] args) 
     {

    String s="krishna uma sucharitha pavanpotnuru pravalikap krishna" ;
      LinkedHashSet<String> hs = new LinkedHashSet<>();
      HashMap<String ,Integer> hm = new HashMap<>();
      for(String w : s.split(" "))
      {
            hm.put(w, hm.getOrDefault(w, 0)+1);

      }
      System.out.println(hm);
     for (Map.Entry<String, Integer> en : hm.entrySet()) {
        {
            if(en.getValue()!=1)
              System.out.println(en.getKey()+"="+en.getValue());
        }
         
    
         
     }
      
      hs.addAll(Arrays.asList(s.split(" ")));
    
    System.out.println(hs);
     
    
    }

}
