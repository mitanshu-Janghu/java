public class Anagram {
    public static void main(String[] args) {
        String s1="aaa";
        String s2="aab";
        System.out.println(check(s1, s2));
    }
    static boolean check(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int[] freq=new int[26];
        for(char c: s1.toCharArray())
            freq[c-'a']++;
        for(char c: s2.toCharArray())
            freq[c-'a']--;
        for (int i : freq) {
            if(i!=0) return false;
        }
   return true; }
}
