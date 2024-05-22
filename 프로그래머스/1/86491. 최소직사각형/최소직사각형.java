import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        for(int[] size : sizes){
            Arrays.sort(size);
        }

        int w = sizes[0][0];
        int h = sizes[0][1];

        for(int i = 0; i < sizes.length; i++){
            if(w < sizes[i][0]) w = sizes[i][0];
            if(h < sizes[i][1]) h = sizes[i][1];
        }

        return w*h;
    }
}