class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for(int i = 0; i <= t.length()-p.length(); i++){
            String sub = t.substring(i, i + p.length());
            sub = sub.replaceFirst("^0+(?!$)", "");

            if (sub.isEmpty()) {
                sub = "0";
            }

//            if(Integer.parseInt(p) >= Integer.parseInt(sub)){
//                answer++;
//            }
            if(Long.parseLong(p) >= Long.parseLong(sub)){
                answer++;
            }
        }

        return answer;
    }
}