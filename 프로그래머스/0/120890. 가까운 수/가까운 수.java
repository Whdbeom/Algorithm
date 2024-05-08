import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            int x = array[i];
            if(Math.abs(n-array[0]) > Math.abs(n - x)){
                array[0] = x;
            }
        }
        answer = array[0];
        return answer;

    }
}