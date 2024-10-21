


public class convertwordToString {
    
        public static void main(String[] args)
        {

            int s =18247;
            String k = String.valueOf(s);
            String[] v= {"Zero","one","two","three","four","five","six","seven","eight","Nine"};
            
           StringBuilder sb =new StringBuilder();
           
           for(int i=0; i<k.length(); i++)
           {
            sb.append(v[((k.charAt(i)-'0'+3)%10)]);
           }

            System.out.println(sb.toString());


        }
    
    
}
