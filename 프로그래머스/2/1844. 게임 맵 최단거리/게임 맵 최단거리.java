import java.util.*;

class Solution {
    /*
        maps - 2차원배열 n * m 크기의 게임 맵의 상태가 들어있음
        0 벽
        1 지나갈수 있음
        첫캐릭터 1,1
        상대진영 n,m
    */
    
    public int solution(int[][] maps) {
        int answer = 0;
    
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        
        Queue<int[]> queue = new LinkedList<>();
        
        queue.offer(new int[]{0, 0});
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 범위 밖인 경우
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                
                // 벽에 막힌 경우 + 이미 방문한경우
                if(maps[nx][ny] == 0 || maps[nx][ny] > 1) continue;
                
                //방문한경우
                maps[nx][ny] = maps[x][y] + 1; 
                queue.offer(new int[]{nx, ny});
            }
        }
        
        return maps[n-1][m-1] == 1 ? -1 : maps[n-1][m-1];
    }
}