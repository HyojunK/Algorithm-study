class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        for(int i : array){
            sb.append(Integer.toString(i));
        }
        
        answer = sb.toString().replaceAll("[^7]", "").length();
        
        return answer;
    }
}