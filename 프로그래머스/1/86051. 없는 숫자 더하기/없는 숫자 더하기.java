class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] found = new boolean[10];

        for(int num : numbers){
            found[num] = true;
        }

        for(int i = 0; i < found.length; i++){
            if(!found[i]){
                answer += i;
            }
        }
        return answer;
    }
}