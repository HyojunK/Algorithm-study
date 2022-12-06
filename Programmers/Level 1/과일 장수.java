import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // score 배열을 정렬
        Arrays.sort(score);
        
        // 한 상자에서 가장 낮은 가격의 사과의 가격이 높을 수록 많은 이익이 발생하므로
        // 상자마다 가장 비싼 가격의 사과들부터 개수를 채운다
        // 각 상자를 채울 때마다 상자에서 가장 가격이 싼 사과는 남은 사과중 m번째로 비싼 사과가 된다
        // m번째로 비싼사과와 상자당 사과의 개수를 곱하여 이익을 나온 answer에 더한다
        for(int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }
        
        return answer;
    }
}