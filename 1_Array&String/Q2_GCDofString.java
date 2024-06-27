public class Q2_GCDofString {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABCABCABC";
        //str1 = "ABCABC", str2 = "ABC" --> "ABC"
        //str1 = "ABABAB", str2 = "ABAB" --> "AB"
        //str1 = "LEET", str2 = "CODE" --> ""
        //str1 = "LEET", str2 = "LEET" --> "LEET"
        System.out.println(gcdOfStrings(str1, str2));
    }
    public static String gcdOfStrings(String str1, String str2) {
        
        if(!(str1+str2).equals(str2+str1)) return "";
        
        int ansString = gcd(str1.length(), str2.length());
        return str1.substring(0,ansString);
    }

    static int gcd(int s1, int s2){
        return s2 == 0 ? s1 : gcd(s2, s1% s2);
    }
}
