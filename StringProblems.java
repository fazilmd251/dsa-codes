import java.util.HashMap;

public class StringProblems {
    public static void main(String[] args) {
        String c="()";
//        for(int i=0;i<c.length();i++){
//
//        }
        System.out.println("()".hashCode());
        System.out.println(")".hashCode());

    }


    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNum = new HashMap<>();
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);

        int value = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = romanNum.get(s.charAt(i));
            if (i + 1 < s.length() && curr < romanNum.get(s.charAt(i + 1))) {
                value -= curr;
            } else {
                value += curr;
            }
        }
        System.out.println(value);
        return value;
    }
}
