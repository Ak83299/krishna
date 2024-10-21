
import java.util.Arrays;
import java.util.List;


public class e
{
    public static void main(String[] args) {

        String s = "Krishna";
        List<Character> l = Arrays.asList('a','e','i','o','u');
       Boolean k = s.chars().map(c->(char)c).anyMatch(l::contains);

        System.out.println(s.chars().map(c->(char)c).anyMatch(l::contains));

        if(k== true)    
          System.out.println("vowel is there"); 
        else 
        System.out.println("vowel is not there"); 



        
    }

}