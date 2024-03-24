import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String lowercase = my_string.toLowerCase();
        char[] charArr = lowercase.toCharArray();
        Arrays.sort(charArr);

        String answer = new String(charArr);
        return answer;
    }
}