class Solution {
    boolean[] prime = new boolean[2998]; // 소수 배열, false면 소수
    
    public int solution(int[] nums) {
        int answer = 0;

        isPrime();
        
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    if(!prime[sum]) answer++;
                }
            }
        }

        return answer;
    }
    
    // 에라토스테네스의 체
    public void isPrime(){
        prime[0] = prime[1] = true;
        
        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(!prime[i]){
                for(int j = i + i; j < prime.length; j += i){
                    prime[j] = true;
                }
            }
        }
    }
    
}