class Solution {
    public long solution(int price, int money, int count) {
        
        long sum = (long)( count * ( (double)( price + ( price * count ) ) / 2 ) );
            
        return ( sum > money ) ? sum - money : 0; 

    }
}