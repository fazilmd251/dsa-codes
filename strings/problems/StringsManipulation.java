package strings.problems;

import java.util.Arrays;

public class StringsManipulation {

    public void reverseStr(String str) {
        String reversed = "";
        for (char i : str.toCharArray()) {
            reversed = i + reversed;
        }
        System.out.println(reversed);
    }

    public void reverseWordInStr(String str) {
        String[] wordArr = str.split(" ");
        if(wordArr.length<1||wordArr.length==1){
            System.out.println(str);
        }
        String revSentence = "";
        for (int i = wordArr.length - 1; i > 0; i--) {
            revSentence += i == 1 ? wordArr[i] + " " + wordArr[0] : wordArr[i] + " ";
        }
        System.out.println(revSentence);
    }
}
