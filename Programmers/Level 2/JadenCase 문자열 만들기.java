import java.util.*;

class Solution {
    public String solution(String s) {
        
        // 결과 문자열을 저장할 StringBuilder
        StringBuilder sb = new StringBuilder();
        // 문자열 분리
        String[] arr = s.split("");
        
        // 대문자 변환 여부
        boolean uppercase = true;
        for(String letter : arr) {
            // 현재 글자가 공백인 경우 대문자 변환 여부 true로 변경하고 결과 값에 추가
            if(letter.equals(" ")) {
                uppercase = true; 
                sb.append(letter);
            }
            // 현재 글자가 공백이 아닌 경우
            else {
                // 대문자 변환이 필요한 경우 변환하여 결과값에 추가하고 대문자 변환 플래그 false로 설정
                if(uppercase) {
                    sb.append(letter.toUpperCase());
                    uppercase = false;
                }
                else sb.append(letter.toLowerCase());
            }
        }
        
        return sb.toString();
    }
}