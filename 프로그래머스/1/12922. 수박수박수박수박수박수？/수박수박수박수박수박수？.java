class Solution {
    public String solution(int n) {
        
        String tn = "수";
        String qkr = "박";
        
        String answer = "";
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                answer += tn;
            }
            if(i % 2 != 0){
                answer += qkr;
            }
        }
        return answer;
    }
}