class Solution {
    public int solution(String s) {
        String[] str = s.split(" ");
        int answer = 0;

        for(int i = 0; i < str.length; i++){
            if(!str[i].equals("Z")){
                int temp = Integer.parseInt(str[i]);
                answer += temp;
            } else if(str[i].equals("Z")){
                answer -= Integer.parseInt(str[i-1]);
            }

        }
        return answer;

    }
}