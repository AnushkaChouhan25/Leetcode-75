public class Q1_MergeStringsAlternately{
    public static void main(String[] args) {
        System.out.println("Hello World");
        String word1 = "abc", word2 = "pqr  ";
        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        int n;
        String ans ="";
        if(word1.length() > word2.length()){
            n = word1.length();
        }else{
            n = word2.length();
        }
        for(int i = 0; i< n; i++){
            if(word1.length() > i){
            ans += word1.charAt(i);
            }
            if(word2.length() > i){
            ans+= word2.charAt(i);
            }
        }
        return ans;
    }
}