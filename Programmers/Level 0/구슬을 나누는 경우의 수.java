import java.math.*;

class Solution {
    public BigInteger solution(int balls, int share) {
        // 갖고 있는 구슬과 나누어 줄 구슬 개수가 같다면 한 가지 경우만 return
        if(balls == share) return BigInteger.ONE; 
        
        int num = balls; // 분자의 팩토리얼 앞에 붙을 수
        int maxDenom = Math.max(balls - share, share); // 분모의 팩토리얼 앞에 붙을 수 중 큰 수
        int minDenom = balls - maxDenom; // 분모의 팩토리얼 앞에 붙을 수 중 작은 수
            
        BigInteger numVal = BigInteger.ONE;     // 분자 값
        BigInteger denomVal = BigInteger.ONE;   // 분모 값
        
        // 분자 값 = 분자의 팩토리얼 값에서 분모의 큰 팩토리얼 값을 나눈 값
        for(int i = maxDenom + 1; i <= num; i++){
            numVal = numVal.multiply(BigInteger.valueOf(i));
        }
        // 분모에 남은 작은 팩토리얼 값 계산
        for(int i = 2; i <= minDenom; i++){
            denomVal = denomVal.multiply(BigInteger.valueOf(i));
        }
        
        return numVal.divide(denomVal);
    }
}