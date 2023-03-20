class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // 심어야 할 꽃이 없는 경우 바로 true를 return
        if(n == 0) return true;

        for(int i = 0; i < flowerbed.length; i++) {
            // 현재 화단이 비어있는 경우
            if(flowerbed[i] == 0){
                // 첫 화단인 경우
                if(i == 0) {
                    // flowerbed의 길이가 1이거나 오른쪽 화단이 비어있는 경우
                    if(flowerbed.length == 1 || flowerbed[i + 1] == 0) {
                        // 현재 화단에 꽃을 심음
                        flowerbed[i] = 1;
                        // 심어야할 꽃의 수 감소
                        n--;
                    }
                }
                // 마지막 화단인 경우
                else if(i == flowerbed.length - 1) {
                    // 왼쪽 화단이 비어있는 경우
                    if(flowerbed[i - 1] == 0) {
                    /// 현재 화단에 꽃을 심음
                        flowerbed[i] = 1;
                        // 심어야할 꽃의 수 감소
                        n--;
                    }
                }
                // 나머지 화단인 경우
                else {
                    // 좌우의 화단이 모두 비어있는경우
                    if(flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        // 현재 화단에 꽃을 심음
                        flowerbed[i] = 1;
                        // 심어야할 꽃의 수 감소
                        n--;
                    }
                }
            }
            // 심어야할 꽃의 수가 0이 되는 경우 true를 return
            if(n == 0) return true;
        }

        // 남은 꽃의 수가 0인 경우 true, 0보다 큰 경우 false를 return
        return (n == 0) ? true : false;
    }
}