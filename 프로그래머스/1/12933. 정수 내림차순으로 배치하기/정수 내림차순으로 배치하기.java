import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String x = n + "";
        String[] temp = new String[x.length()];
        for(int i = 0; i < x.length(); i++){
            temp[i] = String.valueOf(x.charAt(i));
        }
        Arrays.sort(temp, Collections.reverseOrder());

        String z = "";
        for(String i : temp){
            z += i;
        }


        return Long.parseLong(z);
    }
}