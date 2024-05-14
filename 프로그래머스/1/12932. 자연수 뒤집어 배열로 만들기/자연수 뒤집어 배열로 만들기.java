class Solution {
    public int[] solution(long n) {

        StringBuffer sb = new StringBuffer(String.valueOf(n));
        String reverse = sb.reverse().toString();

        int[] answer = new int[reverse.length()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = Character.getNumericValue(reverse.charAt(i));
        }

        return answer;
    }
}