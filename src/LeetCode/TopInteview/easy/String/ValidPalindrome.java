package LeetCode.TopInteview.easy.String;

public class ValidPalindrome {

    /*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
    it reads the same forward and backward.
    Alphanumeric characters include letters and numbers.

    Given a string s, return true if it is a palindrome, or false otherwise.
     */

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
