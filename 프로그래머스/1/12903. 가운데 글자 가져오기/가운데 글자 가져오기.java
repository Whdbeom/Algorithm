class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length();

        if(n%2==1){
            answer = s.substring(n/2, n/2+1);
        } else if(n%2 == 0) {
            answer = s.substring(n/2 -1, n / 2 + 1);
        }
        return answer;
    }
}