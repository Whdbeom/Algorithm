class Solution {
    public String solution(String phone_number) {
        String answer = "*".repeat(Math.max(0, phone_number.length() - 4)) + phone_number.substring(Math.max(0, phone_number.length() - 4));
        return answer;
    }
}