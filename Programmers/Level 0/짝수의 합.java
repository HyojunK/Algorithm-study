class Solution {
    public int solution(int n) {
        n = (n % 2 == 1)? n - 1 : n;
        
        return n * (n + 2) / 4;
    }
}