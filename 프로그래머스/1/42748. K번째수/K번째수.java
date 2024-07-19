import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int min = commands[i][0] - 1;
            int max = commands[i][1];
            int cnt = commands[i][2] - 1;

            System.out.println("min ::: " + min );
            System.out.println("max ::: " + max );
            int[] tempArr = Arrays.copyOfRange(array, min, max);

            Arrays.sort(tempArr);

            answer[i] = tempArr[cnt];

        }

        return answer;
    }
}