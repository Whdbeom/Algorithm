import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String x = Integer.toString(n);

        for(int i = 0; i < x.length(); i++){
            answer += Character.getNumericValue(x.charAt(i));
        }

        return answer;
    }
}