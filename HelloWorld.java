public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(1254%10);
    }

    public  boolean isAnagram(String s,String t){
        if(s.length()!=t.length())
            return false;

        int[] charCounts =new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i)- 'a']++;
            charCounts[t.charAt(i)- 'a']--;
        }
for (int count:charCounts){
return count !=0;
}
        return true;
    }
}
