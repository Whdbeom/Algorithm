class Solution {
    public int[] solution(int n) {
//        배열의 길이 설정
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                count++;
            }
        }
        int[] answer = new int[count];

//         각 배열의 인덱스에 값 지정
        int array = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                answer[array] = i;
                array++;
            }
        }

        return answer;
    }
}