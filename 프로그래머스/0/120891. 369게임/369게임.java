class Solution {
    public int solution(int order) {
        String str = Integer.toString(order);
        String[] arr = str.split("");
        int answer = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")){
                answer++;
            }
        }
        return answer;
    }
}