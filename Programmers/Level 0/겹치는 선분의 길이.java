class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] area = new int[200]; // -100부터 100까지의 영역 배열. ex) area[0] => (-100 ~ -99), area[1] => (-99 ~ -98)
        
        for(int i = 0; i < 3; i++){ // 각 선분 마다 반복
            /*
             *  선분의 길이만큼 영역값 증가
             *  좌표가 -100부터 시작하기 때문에 100 더함
             */
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++){
                area[j]++;
            }
        }
        
        for(int i : area) { // 영역이 두 번 이상 지나갔다면 answer 값을 증가
            if(i > 1) answer++;
        }
        
        return answer;
    }
}