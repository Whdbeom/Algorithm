class Solution {
    public int solution(int num, int k) {
//        0 < num < 1,000,000
//        0 <= k < 10
//        num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.
        String numStr = Integer.toString(num);
        String[] arr = numStr.split("");

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(Integer.toString(k))){
                return i+1;
            }
        }

        return -1;
    }
}