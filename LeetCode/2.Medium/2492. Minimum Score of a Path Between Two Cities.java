class Solution {
    public int minScore(int n, int[][] roads) {
        // 각 도시의 부모 노드를 저장
        int[] parents = new int[n + 1];
        // 각 도시에 도달할 수 있는 최소 거리를 저장하기 위한 배열
        int[] distances = new int[n + 1];
        
        // 각 도시의 부모 노드를 자신으로 저장하고
        // 각 도시에 도달할 수 있는 거리를 최대값인 10000으로 초기화
        for(int i = 1; i <= n; i++) {
            parents[i] = i;
            distances[i] = 10000;
        }
        
        // 모든 경로 탐색
        for(int i = 0; i < roads.length; i++) {
            // 첫 번째 도시의 최상위 부모 탐색
            int cityA = find(roads[i][0], parents);
            // 두 번째 도시의 최상위 부모 탐색
            int cityB = find(roads[i][1], parents);
            // 첫 번째 도시의 부모값을 두 번째 도시의 부모값으로 union
            parents[cityA] = parents[cityB];
            
            // 현재 탐색중인 도시들로 이동할 수 있는 최소 거리
            // 두 도시간의 이동 거리와 각 도시로 이동할 수 있는 거리값 중 최소값
            int minDistance = Math.min(roads[i][2], Math.min(distances[cityA], distances[cityB]));
            // 각 도시에 도달할 수 있는 최소 거리를 업데이트
            distances[cityA] = distances[cityB] = minDistance;
        }
        
        // 1번 도시부터 이동할 수 있는 경로의 최소값을 탐색하여 return
        return distances[find(1, parents)];
    }

    /**
     * 현재 도시의 최상위 부모에 해당하는 도시를 return
     * 
     * @param city      : 현재 탐색중인 도시
     * @param parents   : 각 도시의 부모 배열
     * @return            현재 도시의 부모
     */
    public static int find(int city, int[] parents) {
        // 현재 탐색중인 도시의 부모가 자신인 경우 자신을 바로 return
        if(parents[city] == city) return city;
        
        // 부모를 탐색하여 return
        return find(parents[city], parents);
    }
}