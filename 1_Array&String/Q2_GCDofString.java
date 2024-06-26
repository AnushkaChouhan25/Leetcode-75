public class Q2_GCDofString {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABCABCABC";
        System.out.println(gcd(str1, str2));
    }
    public static String gcd(String str1, String str2) {
        int gcd = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    gcd++;
                    }
                    }
                    }
                    return str1.substring(0, gcd);
                    }
    
}
