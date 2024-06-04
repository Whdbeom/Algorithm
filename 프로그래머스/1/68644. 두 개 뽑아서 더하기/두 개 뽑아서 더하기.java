import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                ts.add(numbers[i] + numbers[j]);
            }
        }

        return ts.stream().mapToInt(Integer::intValue).toArray();
    }
}