import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
                int cnt = 0;
        for(int num : arr){
            if(num%divisor == 0){
                cnt++;
            }
        }

        int[] answer = new int[cnt];
        int index = 0;

        for(int num : arr){
            if(num % divisor == 0){
                answer[index++] = num;
            }
        }
        
        if(index == 0){
            return  new int[]{-1};
        }
        
        Arrays.sort(answer);

        return answer;
    }
}