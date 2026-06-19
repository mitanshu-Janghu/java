public class skipcharac {
    public static void main(String[] args) {
        String s = "bacdcabsdsa";
        System.out.println(skip(s, 'a', ""));
    }

    static String skip(String s, char ch, String ans) {
        if (s.isEmpty()) {
            return ans;
        }

        if (s.charAt(0) != ch) {
            return skip(s.substring(1), ch, ans + s.charAt(0));
        } else {
            return skip(s.substring(1), ch, ans);
        }
    }
}