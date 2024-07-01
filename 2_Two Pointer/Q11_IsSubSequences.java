public class Q11_IsSubSequences {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ahbgdc";
        System.out.println(isSubsequence(s1, s2));
    }
    public static boolean isSubsequence(String s, String t) {
        int j = 0; 
        for(int i = 0 ; i<t.length(); i++){
            if(j< s.length()){
                if(s.charAt(j) == t.charAt(i)){
                    j++;
                }
            }
            else break;
        }
        return j == s.length();
    }
}