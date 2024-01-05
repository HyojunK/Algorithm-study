class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            // 현재 자리에서 1을 더한 경우가 10이 되는 경우
            if(++digits[i] == 10) {
                // 값을 0으로 바꾸고 다음 자리수 탐색
                digits[i] = 0;
            } else {
               return digits;
            }
        }

        // 마지막 까지 수가 증가한 경우에는 자리수가 1 증가하고
        // 첫 번째 자리는 1, 나머지는 0이되는 경우이다.
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;

        return newArray;
    }
}