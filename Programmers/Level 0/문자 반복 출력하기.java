class Solution {
    public String solution(String my_string, int n) {
        String[] arr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        
        for(String s : arr){
            for(int i = 0; i < n; i++){
                sb.append(s);
            }    
        }
        
        return sb.toString();
    }
}