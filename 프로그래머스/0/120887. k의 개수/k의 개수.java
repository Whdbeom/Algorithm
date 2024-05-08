class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String sk = String.valueOf(k);

        for(int temp = i; temp <= j; temp++){
            String[] tempArr = String.valueOf(temp).split("");
            for(int z = 0; z < tempArr.length; z++){
                String x = tempArr[z];
                if(x.equals(sk)){
                    answer++;
                }
            }
        }

        return answer;
    }
}