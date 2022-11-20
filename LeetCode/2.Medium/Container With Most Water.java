class Solution {
    public int maxArea(int[] height) {
        // 양 끝점에서 시작
        int left = 0;
        int right = height.length - 1;
        // 최대 면적
        int maxArea = (right - left) * Math.min(height[left], height[right]);
        // 현재 탐색 면적
        int area = 0;
        
        // 양 끝점이 교차할 때까지 반복
        while(left < right) {
            // left와 right의 높이 중 낮은쪽의 인덱스를 이동
            if(height[left] <= height[right]) {
                left ++;
            } else {
                right--;
            }
            
            // 새로 구한 넓이가 최대라면 최대값 갱신
            area = (right - left) * Math.min(height[left], height[right]);
            if(area > maxArea) maxArea = area;
        }

        return maxArea;
    }
}