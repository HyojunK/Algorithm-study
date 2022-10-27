class Solution {
    public int solution(String A, String B) {
        StringBuilder sb = new StringBuilder(B);
        sb.append(B);
        return sb.toString().indexOf(A);
    }
}