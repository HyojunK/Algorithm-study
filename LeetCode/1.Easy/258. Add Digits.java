class Solution {
    public int addDigits(int num) {
        // 주어진 숫자가 0인 경우 0을 return
        if(num == 0) return 0;
        // 주어진 숫자가 9로 나누어 떨어지는 경우 9를 return
        if(num % 9 == 0) return 9;
        // 이외의 경우 9로 나눈 나머지를 return
        return num % 9;
    }
}
