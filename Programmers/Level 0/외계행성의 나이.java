class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        while(age > 0){
            char c = (char)((age % 10) + 97);
            age /= 10;
            sb.insert(0, c);
        }
        
        return sb.toString();
    }
}