package LeetCode.TopInteview.easy.String;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacter {

    /*
    Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
     */

    public static void main(String[] args){
        System.out.println(new FirstUniqueCharacter().firstUniqChar("dddccdbba"));
    }

    public int firstUniqChar(String s) {
        if(s.length() == 1){
            return 0;
        }
        char[] arr = s.toCharArray();
        Set<Character> ex = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j] || ex.contains(arr[i])){
                    ex.add(arr[i]);
                    break;
                }
                if(j == arr.length-1){
                    return i;
                }
            }
        }
        if(!ex.contains(arr[arr.length-1])){
            return arr.length-1;
        }
        return -1;
    }
}
