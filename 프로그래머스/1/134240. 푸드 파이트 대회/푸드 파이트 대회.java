class Solution {
   public static String solution(int[] food) {
        String answer = "";

        for(int i = 1; i < food.length; i++) {
            if(food[i] % 2 == 0){
                for(int j = 0; j < food[i]/2; j++){
                    answer += i;
                }
            } else {
                for(int j = 0; j < (food[i]-1)/2; j++){
                    answer += i;
                }
            }
        }

        String reverse = "";
        for(int i = answer.length()-1; i >= 0; i--){
            reverse += answer.charAt(i);
        }

        answer += 0;

        answer += reverse;

        return answer;
    }
}