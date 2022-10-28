import java.util.*;

class Solution {
    public String solution(String polynomial) {
        int xVal = 0; // x항 값
        int consVal = 0; // 상수항 값
        
        StringTokenizer st = new StringTokenizer(polynomial, " + "); // 공백과 더하기를 기준으로 문자열 분리
        while(st.hasMoreTokens()){
            String value = st.nextToken();
            if(value.substring(value.length() - 1).equals("x")){ // x항인 경우
                // x만 있는 경우 1, 앞에 숫자가 있는 경우 수를 x항값에 더함
                xVal += (value.length() == 1)? 1 : Integer.parseInt(value.substring(0, value.length() - 1));
            } else { // 상수항인 경우
                // 상수항에 값을 더함
                consVal += Integer.parseInt(value);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        // "ax + b" 형태로 수식 조합
        if(xVal != 0){
            if(xVal > 1) sb.append(xVal);
            sb.append("x");
        }
        if(consVal != 0){
            if(sb.length() > 0) sb.append(" + ");
            sb.append(consVal);
        }
        
        
        return sb.toString();
    }
}