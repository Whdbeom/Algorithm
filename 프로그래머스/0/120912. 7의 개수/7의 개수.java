class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for(int i = 0; i < array.length; i++){
            String x = Integer.toString(array[i]);
            String[] y = x.split("");
            for(int j = 0; j < y.length; j++){
                if(y[j].equals("7")){
                    answer++;
                }
            }
        }

        return answer;
    }
}