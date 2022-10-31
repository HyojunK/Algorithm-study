import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            score[i][0] += score [i][1]; // 각 점수 배열의 첫 번째 인덱스에 영어, 수학 점수의 합 저장
            score[i][1] = i; // 두 번째 인덱스에 현재 탐색중인 인덱스 저장
        }
        
        // 점수의 합 기준으로 정렬
        Arrays.sort(score, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o2[0] - o1[0];
            }
        });
        
        int prevScore = -1; // 이전 탐색한 점수
        int rank = 0;       // 현재 적용할 순위
        int tie = 1;        // 공동 순위인 수
        
        for(int[] arr : score) {
            if(arr[0] == prevScore) {   // 현재 탐색중인 점수가 이전 점수와 같다면
                tie++;                  // 공동 순위 증가
            } else {                    // 현재 탐색중인 점수가 이전 점수와 다르다면
                rank += tie;            // 공동 순위 만큼 순위 증가
                tie = 1;                // 공동순위 초기화
            }
            prevScore = arr[0];         // 이전 탐색 점수에 현재 점수값 저장
            answer[arr[1]] = rank;      // 해당 점수의 인덱스를 찾아 정답 배열에 순위 입력
        }
        
        return answer;
    }
}