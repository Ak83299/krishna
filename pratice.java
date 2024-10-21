

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class pratice {
    


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);
        //List<Integer> uniqueList = new ArrayList<>(set);
        Set<Integer> us = new LinkedHashSet<>();
            Map<Integer, Integer> map = new LinkedHashMap<>();
        
        for(Integer k : list)
        {
          map.put(k,map.getOrDefault(k, 0)+1);
        }
        for(Integer k : map.keySet())
        {
            if(map.get(k)!=1)
               us.add(k);

        }
    
    
        System.out.println("List after removing duplicates: " +us);
    }
}

    

