class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for(String[] info : db){
            if(id_pw[0].equals(info[0])){
                if(id_pw[1].equals(info[1])){
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            }
        }
        
        return answer;
    }
}