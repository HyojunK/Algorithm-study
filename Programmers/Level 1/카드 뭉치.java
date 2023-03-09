class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        // cards1 에서 현재 사용 가능한 카드 위치
        int index1 = 0;
        // cards2 에서 현재 사용 가능한 카드 위치
        int index2 = 0;
        
        // goal 배열의 모든 문자열 탐색
        for(String s : goal) {
            // cards1에 사용 가능한 카드가 남아있는 경우
            if(index1 < cards1.length) {
                // 현재 탐색중인 문자열이 사용가능한 경우 카드 위치 인덱스 증가시키고 다음 문자열 탐색
                if(cards1[index1].equals(s)) {
                    index1++;
                    continue;
                }
            }
            // cards2에 사용 가능한 카드가 남아있는 경우
            if(index2 < cards2.length) {
                // 현재 탐색중인 문자열이 사용가능한 경우 카드 위치 인덱스 증가시키고 다음 문자열 탐색
                if(cards2[index2].equals(s)) {
                    index2++;
                    continue;
                }
            }
            // 두 카드뭉치에서 모두 사용이 불가능한 경우 No를 return
            return "No";
        }
        
        return answer;
    }
}