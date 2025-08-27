class Solution {
    public int solution(int chicken) {
        int result = 0;
        while(chicken >= 10){
            int x = chicken / 10;
            result += x;
            chicken = (chicken % 10) + x;
        }
        
        return result;
    }
}