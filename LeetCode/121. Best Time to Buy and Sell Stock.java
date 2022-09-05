class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;           // 최대 이익
        int minPrice = prices[0];   // 최소 가격
        
        for(int price : prices) {
            minPrice = Math.min(price, minPrice);                  // 현재 가격과 최소 가격 중 작은 값을 최소 가격으로 설정
            maxProfit = Math.max(price - minPrice, maxProfit);  // 현재 가격에서 최소 가격을 뺀 값과 최대 이익값 중 큰 값을 최대 이익으로 설정
        }
        
        return maxProfit; // 최대 이익값 리턴
    }
}