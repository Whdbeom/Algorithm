class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        char[] charArr = s.toCharArray();

        int count = 0;
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] != ' '){
                if(count%2==0){
                    charArr[i] = Character.toUpperCase(charArr[i]);
                } else {
                    charArr[i] = Character.toLowerCase(charArr[i]);
                }
                count++;
            } else {
                count = 0;
            }
            answer.append(charArr[i]);
        }

        return answer.toString();
    }
}