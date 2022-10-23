class Solution {
    public String solution(String bin1, String bin2) {
        int x = Integer.parseInt(bin1, 2);
        int y = Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(x + y);
    }
}