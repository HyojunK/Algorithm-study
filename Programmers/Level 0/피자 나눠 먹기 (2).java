class Solution {
    public int solution(int n) {
        int lcm = 6 * n / gcd(6, n);
        return lcm / 6;
    }
    
    public int gcd(int a, int b){
        int r = a % b;
        if(r == 0) return b;
        else return gcd(b, r);
    }
}