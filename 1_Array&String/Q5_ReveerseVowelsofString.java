public class Q5_ReveerseVowelsofString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello")); 
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("icecream")); //acecreim
    }
    public static String reverseVowels(String str) {
        char []ch = str.toCharArray();
        String vowels = "aeiouAEIOU";
        int s = 0;
        int e = str.length()-1;
        while(s < e){
            while(s < e && vowels.indexOf(ch[s]) == -1){
                s++;
            }
            while(s < e && vowels.indexOf(ch[e]) == -1){
                e--;
            }
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;

            s++; e--;
        }
        return new String(ch);
    }
}
