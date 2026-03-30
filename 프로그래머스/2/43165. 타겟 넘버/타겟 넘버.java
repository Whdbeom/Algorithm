import java.util.*;
import java.io.*;

class Solution {
    
    static int count;
    static int[] numbers;
    static int staticTarget;
    
    public int solution(int[] nums, int target) throws Exception{
        
        count = 0;
        numbers = nums;
        staticTarget = target;
        
        dfs(0, 0);
        return count;
    }
    
    static void dfs(int index, int sum){
        if(index == numbers.length){
            if(sum == staticTarget){
                count++;                
            }    
            return;
        }
        
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);       
    }
}