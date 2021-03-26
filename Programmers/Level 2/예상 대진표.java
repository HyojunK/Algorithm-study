class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1; //기본값 한 경기

        //두 수의 차가 1이면서 한 게임에 들어있을 때 까지 반복
        while(a - b != 1 && a - b != -1 || a / 2 == b / 2) {
			a = (a % 2 == 0)? a / 2 : a / 2 + 1; //짝수면 나누기 2, 홀수면 나누기 2 + 1
			b = (b % 2 == 0)? b / 2 : b / 2 + 1;
			
			answer++; //게임 수 증가
		}

        return answer;
    }
}