class Solution {
    public int solution(int[][] dots) {
        int xMax = -256;
        int xMin = 256;
        int yMax = -256;
        int yMin = 256;
        
        for(int[] dot : dots) {
            xMax = Math.max(dot[0], xMax);
            xMin = Math.min(dot[0], xMin);
            yMax = Math.max(dot[1], yMax);
            yMin = Math.min(dot[1], yMin);
        }
        
        return Math.abs(xMax - xMin) * Math.abs(yMax - yMin);
    }
}