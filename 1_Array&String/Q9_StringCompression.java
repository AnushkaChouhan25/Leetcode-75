public class Q9_StringCompression {
    public static void main(String[] args) {
        char[]chars = {'a','a','b','b','c','c','c'};
        // char[]chars = {'a'};
        // char[]chars = {'a','b','b','b','b','b','b','b','b','b'};

        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        int ans = 0;  
        for (int i = 0; i < chars.length;) {
          final char letter = chars[i]; 
          int count = 0; 
          
          while (i < chars.length && chars[i] == letter) {
            ++count;
            ++i;
          } 
          chars[ans++] = letter;
     
          if (count > 1) {
            char[] c = String.valueOf(count).toCharArray();
            for (int j = 0; j < c.length; j++) {
                 chars[ans++] = c[j];
            }
          }
        }
        return ans;
      }
}
