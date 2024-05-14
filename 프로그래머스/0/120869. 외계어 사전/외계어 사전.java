import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
           int answer = 2;
        Arrays.sort(spell);
        String spellStr = "";
        for(int i = 0; i < spell.length; i++) {
            spellStr += spell[i];
        }


        for(int i = 0; i < dic.length; i++){
            String[] temp = new String[dic[i].length()];
            temp = dic[i].split("");
            Arrays.sort(temp);
            String x = "";

            for(int j = 0; j < temp.length; j++){
                x += temp[j];
            }

            if(spellStr.equals(x)){
                answer = 1;
            }
        }

        return answer;
    }
}