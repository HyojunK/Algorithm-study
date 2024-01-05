class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0; // 올림 수
        int maxLength = Math.max(a.length(), b.length());

        for(int i = 0; i < maxLength; i++) {
            int bitA = (i < a.length()) ? a.charAt(a.length() - 1 - i) - '0' : 0;
            int bitB = (i < b.length()) ? b.charAt(b.length() - 1 - i) - '0' : 0;

            int sum = bitA + bitB + carry;

            sb.insert(0, sum % 2);
            carry = sum / 2;
        }

        if(carry > 0) {
            sb.insert(0, carry);
        }

        return sb.toString();
    }
}