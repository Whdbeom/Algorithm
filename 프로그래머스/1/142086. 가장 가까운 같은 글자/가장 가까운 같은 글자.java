import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
                int[] answer = new int[s.length()];

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < answer.length; i++) {
            char currentChar = s.charAt(i);
            answer[i] = !map.containsKey(currentChar) ? -1 : i - map.get(currentChar);
            map.put(currentChar, i); 
        }
        
        return answer;
    }
}