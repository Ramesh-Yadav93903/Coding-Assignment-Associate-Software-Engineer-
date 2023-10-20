import java.util.*;
class Main {
    public static boolean isPangram(String str) {
        str = str.toLowerCase(); 
        boolean[] alphabet = new boolean[26]; 
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') { 
                alphabet[c - 'a'] = true; 
            }
        }
        
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false; 
            }
        }
        
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence =sc.next();
        boolean result = isPangram(sentence);
        if (result) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}