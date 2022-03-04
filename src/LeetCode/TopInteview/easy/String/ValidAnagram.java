package LeetCode.TopInteview.easy.String;

import java.util.Arrays;

public class ValidAnagram {

    /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     */

    public static void main(String[] args){
        System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}
