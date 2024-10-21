

// public class Annagram
// {

// public static void main(String[] args) 
// {
    
// String s ="slient";
// String s1="listenk";
// boolean b=annagrams(s, s1);
// if(b!=true)
//  System.out.println("both are not annagrams");
// else
// System.out.println("both are  annagrams");
// }
// }

// if(s.length()==s1.length())
// {

// char[] c=s.toCharArray();
// char[] d=s1.toCharArray();

// Arrays.sort(c);
// Arrays.sort(d);
// if(Arrays.equals(c,d))
// System.out.println("both Strings are Annagrams");
// }
// else // System.out.println("both Strings are not Annagrams");

// }
//}


import java.util.HashMap;

public class annagrams {
    public static boolean isannagram(String s, String s1) {
        if (s.length() != s1.length()) {
            return false;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        System.out.println(charCount);

        for (char c : s1.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "silent";
        String s1 = "listenk";
        boolean b = isannagram(s, s1);
        if (!b) {
            System.out.println("Both are not anagrams");
        } else {
            System.out.println("Both are anagrams");
        }
    }
}





