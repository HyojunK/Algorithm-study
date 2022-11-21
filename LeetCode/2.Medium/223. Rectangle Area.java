class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        /*
         * 전체 사각형의 넓이
         * 두 사각형의 넓이의 합
         */
        int totalArea = (ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1);
        /*
         * 사각형이 겹치지 않는 경우 
         * 
         * 한 사각형의 오른쪽 위 x좌표가 다른 사각형의 왼쪽 아래 x좌표 보다 작거나 같은 경우
         * 한 사각형의 오른쪽 위 y좌표가 다른 사각형의 왼쪽 아래 y좌표 보다 작거나 같은 경우
         */
        if(ax2 <= bx1 || bx2 <= ax1 || ay2 <= by1 || by2 <= ay1) {
            System.out.println(totalArea);
            // 두 사각형의 넓이의 합 return
            return totalArea;
        }
        
        /*
         * 사각형이 겹치는 경우
         *
         * 겹치는 사각형의 오른쪽 X좌표
         * 각 사각형의 오른쪽 위 좌표인 x2좌표 중 작은 값
         */
        int rightX = Math.min(ax2, bx2);
        /*
         * 겹치는 사각형의 왼쪽 X좌표
         * 각 사각형의 왼쪽 아래 좌표인 x1좌표 중 큰 값
         */
        int leftX = Math.max(ax1, bx1);
        /*
         * 겹치는 사각형의 위쪽 Y좌표
         * 각 사각형의 오른쪽 위 좌표인 y2좌표 중 작은 값
         */
        int topY = Math.min(ay2, by2);
        /*
         * 겹치는 사각형의 아래쪽 Y좌표
         * 각 사각형의 왼쪽 아래 좌표인 y1좌표 중 큰 값
         */
        int bottomY = Math.max(ay1, by1);
        
        // 겹치는 사각형의 넓이
        int coveredArea = Math.abs(rightX - leftX) * Math.abs(topY - bottomY);

        // 두 사각형의 넓이의 합에서 겹치는 만큼의 넓이를 뺌
        return totalArea - coveredArea;
    }
}