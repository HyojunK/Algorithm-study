class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> answer = new ArrayList<>();

        for(int i = 0; i < candies.length; i++){
            maxCandies = Math.max(candies[i], maxCandies);
            candies[i] += extraCandies;
        }

        for(int i = 0; i < candies.length; i++){
            if(candies[i] >= maxCandies) answer.add(true);
            else answer.add(false);
        }

        return answer;
    }
}