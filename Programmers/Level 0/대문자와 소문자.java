class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        String[] arr = my_string.split("");
        
        for(String s : arr){
            if(s.equals(s.toUpperCase())){
                sb.append(s.toLowerCase());
            } else {
                sb.append(s.toUpperCase());
            }
        }
        
        return sb.toString();
    }
}