class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> cityMap = new HashMap<>();

        for(List<String> path : paths) {
            cityMap.put(path.get(0), path.get(1));
        }

        String start = paths.get(0).get(0);

        while(cityMap.get(start) != null) {
            start = cityMap.get(start);
        }

        return start;
    }
}