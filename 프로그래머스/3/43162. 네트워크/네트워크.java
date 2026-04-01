class Solution {
    /*
        A-B  B-C
        A  --  C
        
        컴퓨터의 개수 n
        연결에대한 정보 computers
        
        네트웍 갯수 리턴
    */
    
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int count = 0;
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i, computers);
                count++;
            }
        }
        
        return count;
    }
    
    static void dfs(int node, int[][] computers){
        visited[node] = true;
        
        for(int i = 0; i < computers.length; i++){
            if(computers[node][i] == 1 && !visited[i]){
                dfs(i, computers);
            }
        }
    }
}