import java.util.Vector;
class valid_palidrome_with_recursion {
    public static void main(String args[]){
        String s="A man, a plan, a canal: Panama";
        System.out.print(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        
        Vector<Character> ans = new Vector<>(20, 10);
        char[] arr = s.toCharArray();
        for (char e : arr) {
            if (Character.isLetterOrDigit(e)) {
                ans.add(Character.toLowerCase(e));
            }
        }
        return rec_check(ans, 0, ans.size() - 1);
    }

    public static boolean rec_check(Vector<Character> ans, int start, int end) {
        if (start < end) {
            if (ans.get(start) != ans.get(end)) {
                return false;
            }
            return rec_check(ans, start + 1, end - 1);
        }
        return true;
    }
}   