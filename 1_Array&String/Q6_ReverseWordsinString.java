public class Q6_ReverseWordsinString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    public  static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String output ="";
        for(int i = str.length-1; i >0; i--){
            output += str[i] + " ";
        }
        return output+ str[0];
    }
}
