class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        // 첫 번째 항 구하기
        // 첫 번째 항이 a일 때 n개의 연속된 수를 더한 S를 구하는 일반항
        // S1 = a
        // S2 = a + (a + 1) = 2a + 1
        // S3 = a + (a + 1) + (a + 2) = 3a + 3
        // S4 = a + (a + 1) + (a + 2) + (a + 3) = 4a + 6
        // ...
        // Sn = (a*n) + (n*(n - 1) / 2)

        // num개의 연속된 수를 더하여 total이 될 때 첫 번째 항 a 구하기
        int a = (total - (num*(num-1) / 2)) / num;
        for(int i = 0; i < answer.length; i++){
            answer[i] = a++;
        }

        return answer;
    }
}