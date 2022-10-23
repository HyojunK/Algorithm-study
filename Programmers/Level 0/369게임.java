class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String beforeStr = Integer.toString(order);
        String afterStr = beforeStr.replaceAll("[3,6,9]", "");
        
        answer = beforeStr.length() - afterStr.length();
        
        return answer;
    }
}