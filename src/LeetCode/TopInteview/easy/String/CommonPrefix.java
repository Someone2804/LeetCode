package LeetCode.TopInteview.easy.String;

public class CommonPrefix {

    /*
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".
     */


    public static void main(String[] args){
        System.out.println(new CommonPrefix().longestCommonPrefix(new String[]{"cir","car"}));
        System.out.println(new CommonPrefix().longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(new CommonPrefix().longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }


    public String longestCommonPrefix(String[] strs) {
        int count = strs[0].length();
        for(int i = 1; i < strs.length; i++){
            String s = strs[i];
            int localcount = 0;
            for(int j = 0; j < s.length() && j < count; j++){
                if(strs[i].charAt(j) == strs[i-1].charAt(j)){
                    localcount++;
                }else{
                    break;
                }
            }
            if(localcount == 0){
                return "";
            }
            count = localcount;
        }
        return strs[0].substring(0, count);
    }
}
