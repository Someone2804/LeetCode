package LeetCode.TopInteview.easy.String;

public class ImplementStrStr {

    /*
    Implement strStr().

    Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    Clarification:

    What should we return when needle is an empty string? This is a great question to ask during an interview.

    For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
     */

    public static void main(String[] args){
        System.out.println(new ImplementStrStr().strStr("mississippi", "mississippi"));
        System.out.println(new ImplementStrStr().strStr("mississippi", "issipi"));
    }

    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        if(needle.length() == 0){
            return 0;
        }
        for(int i = 0; i < haystack.length(); i++){
            int count = 0;
            for(int j = 0; j < needle.length(); j++){
                if(haystack.charAt(i) != needle.charAt(j)){
                    break;
                }
                count++;
            }
            if(count == needle.length()){
                return i;
            }
        }
        return -1;
    }
}
