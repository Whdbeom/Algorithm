import java.util.*;

class Node {
    String word;
    int depth;
    
    Node(String word, int depth) {
        this.word = word;
        this.depth = depth;
    }
}

class Solution {
    public int solution(String begin, String target, String[] words) {
        
        if(!Arrays.asList(words).contains(target)) return 0;
        
        boolean[] visited = new boolean[words.length];
        Queue<Node> queue = new LinkedList<>();
        
        queue.offer(new Node(begin, 0));
        
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            
            if(cur.word.equals(target)) return cur.depth;
            
            for(int i = 0; i < words.length; i++){
                if(!visited[i] && diffOne(cur.word, words[i])){
					visited[i] = true;
					queue.offer(new Node(words[i], cur.depth + 1));
                }
            }            
            
        }
        
        return 0;
    }
    
    private boolean diffOne(String a, String b) {
        int cnt = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) cnt++;
        }
        return cnt == 1;
	}

}