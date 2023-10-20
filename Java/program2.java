import java.util.*;

class Main {
    public static int romanToDecimal(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int decimal = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(s.charAt(i));

            if (curValue < prevValue) {
                decimal -= curValue;
            } else {
                decimal += curValue;
            }

            prevValue = curValue;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String romanNumeral = sc.next();
        int decimalNum = romanToDecimal(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to decimal " + decimalNum);
    }
}