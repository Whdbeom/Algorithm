class Solution {
    public boolean solution(int x) {
        String[] arr = String.valueOf(x).split("");
        int sum = 0;
        for(String i : arr){
            sum += Integer.parseInt(i);
        }
        
        return x % sum == 0;
    }
}