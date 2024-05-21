class Solution {
    public int solution(int n) {
        
        int result = 0;
        String x = "";

        while(n > 0){
            x += String.valueOf(n%3);
            n /= 3;
        }

        int length = x.length();

        for(int i = 0; i < length; i++){
            result += Character.getNumericValue(x.charAt(i)) * Math.pow(3, length - 1 - i);
        }

        return result;
    }
}