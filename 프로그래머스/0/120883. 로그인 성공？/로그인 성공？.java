class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for(int i = 0; i < db.length; i++){
            String[] item = db[i];
            if(item[0].equals(id) && !item[1].equals(pw)) {
                answer = "wrong pw";
            } 
            if(item[0].equals(id) && item[1].equals(pw)) {
                answer = "login";  
            } 
        }
        
        return answer;
    }
}