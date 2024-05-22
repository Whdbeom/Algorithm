class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(temp == ' '){
                sb.append(temp);
                continue;
            }

            if(temp >= 'a' && temp <= 'z'){
                temp = (char)('a' + (temp - 'a' + n) % 26);
            } else if (temp >= 'A' && temp <= 'Z') {
                temp = (char) ('A' + (temp - 'A' + n) % 26);
            }
            sb.append(temp);

        }
        return sb.toString();
    }
}