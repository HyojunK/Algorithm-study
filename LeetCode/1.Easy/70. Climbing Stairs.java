class Solution {
    static int[] data = new int[45]; 
    
    public int climbStairs(int n) {
        return fibonacci(n); // n번째 피보나치 함수
    }
    
    static int fibonacci(int n){
        if(n < 3) return n; // 1과 2일 경우, 그대로 return
        if(data[n-1] != 0) return data[n-1]; // data 배열에서 n-1에 대해 저장된 값이 있으면 그 값을 return
        
        return data[n-1] = (fibonacci(n-1) + fibonacci(n-2)); // data 배열에 저장된 값이 없다면 n번째 피보나치 수를 구하는 동시에 return
    }
}