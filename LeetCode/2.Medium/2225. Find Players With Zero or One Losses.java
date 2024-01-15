class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        TreeMap<Integer, Integer> defeatMap = new TreeMap<>();

        for(int[] result : matches) {
            int winner = result[0];
            int loser = result[1];

            defeatMap.put(winner, defeatMap.getOrDefault(winner, 0));
            defeatMap.put(loser, defeatMap.getOrDefault(loser, 0) + 1);
        }

        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : defeatMap.entrySet()) {
            if(entry.getValue() == 0) {
                zero.add(entry.getKey());
            }
            else if(entry.getValue() == 1) {
                one.add(entry.getKey());
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(zero);
        answer.add(one);

        return answer;
    }
}