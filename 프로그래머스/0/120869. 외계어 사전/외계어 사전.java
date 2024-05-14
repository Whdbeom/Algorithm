import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        String spellStr = String.join("", spell); 

        Arrays.sort(dic);

        for (String word : dic) {
            String sortedWord = String.join("", Arrays.stream(word.split("")).sorted().toArray(String[]::new)); 
            if (spellStr.equals(sortedWord)) { 
                answer = 1;
                break; 
            }
        }

        return answer;
    }
}