
import java.util.ArrayList;

public class substring {
    public static void main(String[] args) 
    {
        String k = "geeksforgeeks";
        ArrayList<String> v = new ArrayList<>(); 
        
        for (int i = 0; i <k.length()+1; i++) {
            for (int j = i+1; j < k.length()+1; j++) {
                v.add(k.substring(i, j));
                

            
        }}

        System.out.println(v);
        System.out.println(v.size());

    
    }
}
