package LeetCode.TopInteview.easy.String;

public class ReverseString {
    /*
    Write a function that reverses a string. The input string is given as an array of characters s.

    You must do this by modifying the input array in-place with O(1) extra memory.
     */
    public void reverseString(char[] s) {
        char tmp;
        for(int i = 0; i < s.length/2; i++){
            tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
}
