class Solution {
    public String solution(String X, String Y) {
        // 문자열 X에 사용된 숫자의 개수를 저장할 배열
        int[] xNumbers = new int[10];
        // 문자열 Y에 사용된 숫자의 개수를 저장할 배열
        int[] yNumbers = new int[10];
        
        // 정답 문자열을 만들기 위한 StringBuilder
        StringBuilder sb = new StringBuilder();
        
        // X에 사용된 숫자 개수 탐색
        for(int i = 0; i < X.length(); i++) {
            xNumbers[X.charAt(i) - '0']++;
        }
        // Y에 사용된 숫자 개수 탐색
        for(int j = 0; j < Y.length(); j++) {
            yNumbers[Y.charAt(j) - '0']++;
        }
        
        
        // 9부터 감소시키며 두 문자열에서 사용된 숫자 개수를 탐색
        for(int i = 9; i >= 0; i--) {
            // X와 Y에서 사용된 i의 개수 중 작은 수를 구함
            int cnt = Math.min(xNumbers[i], yNumbers[i]);
            
            // 0을 탐색할 때
            if(i == 0) {
                // 현재까지 만들어진 문자열이 없고 0이 1번 이상 사용된 경우 "0"을 return
                if(sb.length() == 0 && cnt > 0) return "0";
                // 현재까지 만들어진 문자열이 없고 0도 사용되지 않은 경우 "-1"을 return
                else if(sb.length() == 0 && cnt == 0) return "-1";
            }
            
            // 숫자가 사용된 횟수만큼 정답 문자열에 추가
            for(int j = 0; j < cnt; j++) {
                sb.append(i);
            } 
        }
        
        return sb.toString();
    }
}