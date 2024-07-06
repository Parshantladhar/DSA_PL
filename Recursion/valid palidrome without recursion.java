import java.util.Vector;
class Solution {
    public boolean isPalindrome(String s) {
        
        Vector<Character> ans = new Vector<>(20,10);
        char[] arr = s.toCharArray();
        for(Character e : arr){
            if(e.isLetterOrDigit(e)){
                ans.add(e.toLowerCase(e));
            }
        }
        int start=0,end=ans.size()-1;
        while(start<end){
            if(ans.get(start)!=ans.get(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}