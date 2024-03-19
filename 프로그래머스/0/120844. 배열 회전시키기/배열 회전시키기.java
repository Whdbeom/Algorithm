class Solution {
    public int[] solution(int[] numbers, String direction) {
// 3 ≤ numbers의 길이 ≤ 20
// direction은 "left" 와 "right" 둘 중 하나입니다.
        int[] answer = new int[numbers.length];

        if(direction.equals("right")){
            for(int i = 0; i < answer.length - 1; i++){
                answer[i + 1] = numbers[i];
            }
            answer[0] = numbers[numbers.length -1];
        } else {
            for(int i = 0; i < answer.length - 1; i++){
                answer[i] = numbers[i + 1];
            }
            answer[answer.length - 1] = numbers[0];
        }
        return answer;
    }
}