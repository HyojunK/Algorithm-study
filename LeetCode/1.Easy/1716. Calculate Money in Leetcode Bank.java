class Solution {
    public int totalMoney(int n) {
        // 7개씩 잘랐을 때 길이
        int l = n / 7;

        // 공차가 7인 등차수열의 합
        // a = 첫번째 항 = 28
        // n = 항의 개수 = l
        // d = 공차 = 7
        // n(2a + (n - 1)d) / 2
        int answer = l * ((2 * 28) + ((l - 1) * 7)) / 2;

        // 남은 수의 합 계산
        // 첫 번째 항 = l + 1
        // 항의 개수 = n % 7
        // 공차 = 1
        answer += (n % 7) * ((2 * (l +1)) + ((n % 7) - 1)) / 2;

        return answer;
    }
}