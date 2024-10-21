


public class ReverseVowles {
    public static void main(String[] args)
    {
      String p ="Krishna";
      char[] c =p.toCharArray();
      int s =0 ;
      String v = "AEIOUaeiou";
      StringBuilder g = new StringBuilder();
     while(s<p.length())
     {
         if(v.indexOf(c[s])==-1)
         {
            g.append(c[s]);
        }
           s++;
         
     }
     System.out.println(g.toString());
    }
   }

    //   while (s<e) { 
    //     while(s<e && v.indexOf(c[s])==-1)
    //     {  s++;}
    //     while(s<e && v.indexOf(c[e])==-1)
    //     {
    //         e--;
    //     }
    //     if (s < e) {
    //         char temp = c[s];
    //         c[s] = c[e];
    //         c[e] = temp;
    //         s++;
    //         e--;
    //     }
    

    //     }
    
    
    
    

