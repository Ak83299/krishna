import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNon {
    public static void main(String[] args) {
        String s = "DGILHDIKNKDNKVNKN";

        char k = first(s);
        if (k != 0) {
            System.out.println("The first non-repeating character is: " + k);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char first(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            System.out.println("character " + en.getKey() + " \n" + en.getValue());
            if (en.getValue() == 1) {
                return en.getKey();
            }
        }

        return 0; // Return 0 if no non-repeating character is found
    }
}
