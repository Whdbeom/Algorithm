class Solution {
    public int solution(String name) {
        char[] nameChars = name.toCharArray();
        
        int result = 0;
        // 위아래 카운트
        for(int i = 0; i < nameChars.length; i++){
            result += Math.min(nameChars[i] - 'A', 'Z' - nameChars[i] + 1);            
        }
        
        // 좌우 카운트
        int move = nameChars.length - 1;
        
        for(int i = 0; i < nameChars.length; i++){
            int next = i + 1;
            
            // 다음 위치부터 연속된 A 구간 찾기
            while(next < nameChars.length && nameChars[next] == 'A'){
                next++;
            } 
            
			// i까지 오른쪽으로 갔다가 되돌아오는 경우
			int case1 = i * 2 + (nameChars.length - next);

			// 끝쪽 먼저 갔다가 돌아오는 경우
			int case2 = i + (nameChars.length - next) * 2;

			move = Math.min(move, Math.min(case1, case2));            
        } 
        
        
        return result + move;
    }
}