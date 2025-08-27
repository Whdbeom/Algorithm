class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] revArr = new double[score.length];
        for(int i = 0; i < score.length; i++){
            double rev = (score[i][0] + score[i][1]) / 2.0;
            revArr[i] = rev;
        }
        
        for(int i = 0; i < score.length; i++){
            int count = 1;
            for(int j = 0; j < score.length; j++){
                if(i == j) continue;
                if(revArr[i] < revArr[j]) count++;
            }
            answer[i] = count;
        }    
        
        return answer;
    }
}