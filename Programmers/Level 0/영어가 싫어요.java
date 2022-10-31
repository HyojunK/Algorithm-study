import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);
        
        int start = 0;  // 문자열 시작 인덱스
        int end = 3;    // 문자열 종료 인덱스
        while(end <= numbers.length()){
            if(numberMap.get(numbers.substring(start, end)) != null){    // 문자를 숫자로 변환한 값이 존재하는 경우
                answer *= 10;   // 정답 한자리 증가
                answer += numberMap.get(numbers.substring(start, end)); // 변환값 추가
                start = end;    // 시작 인덱스를 종료 인덱스로 옮김
                end += 3;       // 종료 인덱스를 3만큼 추가 ( 숫자를 문자로 나타냈을 때 가장 작은 길이가 3이므로 )
            } else {            // 문자를 숫자로 변환한 값이 존재하지 않는 경우
                end++;          // 종료 인덱스를 하나 증가시킴
            }
        }
        return answer;
    }
}