class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;

        int start = timeSeries[0];
        int end = timeSeries[0] + duration - 1;

        for(int i = 1; i < timeSeries.length; i++) {
            if(timeSeries[i] <= end) {
                end = timeSeries[i] + duration - 1;
            }
            else {
                total += end - start + 1;
                start = timeSeries[i];
                end = timeSeries[i] + duration -1;
            }
        }

        total += end - start + 1;

        return total;
    }
}