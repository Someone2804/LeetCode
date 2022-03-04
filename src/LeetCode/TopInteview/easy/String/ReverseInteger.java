package LeetCode.TopInteview.easy.String;

public class ReverseInteger {

    /*
    Given a signed 32-bit integer x, return x with its digits reversed.
    If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     */

    public static void main(String[] args){
        System.out.println(new ReverseInteger().reverse(-123));
    }

    public int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        stringBuilder.reverse();
        if(stringBuilder.indexOf("-", stringBuilder.length()-1) > 1){
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            stringBuilder.insert(0, "-");
        }
        long result = Long.parseLong(stringBuilder.toString());
        if(result > Integer.MAX_VALUE){
            return 0;
        }
        return (int) result;
    }
}
