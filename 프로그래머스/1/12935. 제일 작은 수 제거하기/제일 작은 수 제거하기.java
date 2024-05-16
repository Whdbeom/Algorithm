class Solution {
    public int[] solution(int[] arr) {
      int[] answer = new int[arr.length-1];
        int cnt = 0;
        int min = Integer.MAX_VALUE;

        for(int i : arr){
            if(i < min){
                min = i;
            }
            cnt++;
        }
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=min){
                answer[index++] = arr[i];
            }
        }


        if(arr.length==1){
            return new int[]{-1};
        }
        return answer;
    }
}