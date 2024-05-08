import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] a1 = before.toCharArray();
        char[] a2 = after.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        String str1 = new String(a1);
        String str2 = new String(a2);

        return str1.equals(str2) ? 1 : 0;
    }
}