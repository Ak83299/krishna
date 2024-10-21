
import java.util.List;
import java.util.ArrayList;




public class MaxSubarray {

    public static void main(String[] args)  {

        int[] a = {1,2,-8,9,-1,-2,4,5};

        int rs=0,re =0 ; int Maxsum =0;
        
        List<Integer> ls = new ArrayList<Integer>();

        for(int i = 0; i < a.length; i++)
        {
            int crrsum =0;

         for(int j = i; j < a.length; j++)
         {
            crrsum += a[j];
            if(crrsum > Maxsum)
              Maxsum = crrsum;
              re =j;
              rs =i;
         } 
        }
        for(int k = rs; rs<=re; rs++)
          ls.add(a[k]);
        System.out.println(ls);
        
            
        } 
}
 