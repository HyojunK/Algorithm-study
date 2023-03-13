import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        
        // 각 약관별 유효기간을 저장할 Map
        Map<String, Integer> expireMap = new HashMap<>();
        // 약관 만료일 Map에 각 약관별 만료 일자 저장
        for(String term : terms) {
            String termArr[] = term.split(" ");
            expireMap.put(termArr[0], Integer.parseInt(termArr[1]));
        }
        
        // 각 개인정보 별 파기 여부 탐색
        for(int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            String[] privacyArr = privacy.split(" ");
            // 현재 탐색중인 개인정보의 만료일자
            int expireDay = convertToDay(privacyArr[0]) + (expireMap.get(privacyArr[1]) * 28);
            // 오늘이 개인정보의 만료일자를 초과한 경우 정답리스트에 추가
            if(convertToDay(today) >= expireDay) answer.add(i+1);
        }
        
        // 정답 리스트를 배열로 변환하여 반환
        return answer.stream().mapToInt(x->x).toArray();
    }
    
    /**
     * 날짜 형식을 일수로 변환하여 return
     * 
     * @param   변환대상 날짜
     * @return  약관 만료일을 일로 환산한 결과를 반환
     */
    public static int convertToDay(String targetDate) {
        // "."을 기준으로 약관 시작일 문자열 분리
        // 연도, 월, 일로 분리
        String[] date = targetDate.split("[.]");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        
        return (year*12*28) + (month*28) + day;
    }
}