
import java.util.Scanner;
class Alphanumericstring
{

    public static String encode(String str)

     {
                 
                    StringBuilder sb = new StringBuilder();            
              for (char c :str.toCharArray()) {
            
                if(Character.isLetter(c))
                {
                    if(Character.isLowerCase(c))
                    sb.append((char)((c-'a'+3)%26+'a'));
                    else 
                    sb.append((char)((c-'A'+3)%26+'A'));
                }
                else if (Character.isDigit(c))
                {
                    sb.append((char)((c-'0'+3)%10+'0'));
                }
                else 
                   sb.append(c);
            }
            
              return sb.toString();
    }




//     return 

//       return str.chars().mapToObj(c->{if(Character.isLetter(c))
//                                  {
//                                     return (char)((c-'a'+3)%26+'a');
//                                  }
//                                  else if (Character.isDigit(c))
//                                    return ((char)((c-'0'+3)%26+'0'));
//                                 else
//                                   return (char)c;}
//       ).map(String::valueOf).collect(Collectors.joining());
//                             }
                        
// //     
    public int reverse(int n)
    {
        Integer k = Integer.valueOf((new StringBuilder(String.valueOf(n)).reverse().toString()));
       
        //Integer l = Integer.valueOf(new StringBuffer(String.valueOf(n)).reverse().toString());
        
        return k;
    
    }

   
    
     

public static void main(String args[])
{
     Scanner scanner = new Scanner(System.in); 
    String str = scanner.nextLine();
   
 System.out.println(encode(str));
    scanner.close();
}    
}
