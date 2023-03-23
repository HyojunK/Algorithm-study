class Solution {
    List<ArrayList<Integer>> graph = new ArrayList<>();
    boolean[] visited;

    public int makeConnected(int n, int[][] connections) {
        int answer = -1;

        // n개의 컴퓨터를 모두 연결하기 위한 케이블의 최소 개수는 n - 1개
        // 케이블의 개수가 n - 1개보다 적다면 연결이 불가하므로 -1을 return
        if(connections.length < n - 1) return answer;

        // 각 노드의 방문 여부를 저장할 배열
        visited = new boolean[n];
        
        // 각 컴퓨터별 노드 생성
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // 각 케이블의 연결 관계를 저장
        for(int[] connection : connections) {
            graph.get(connection[0]).add(connection[1]);
            graph.get(connection[1]).add(connection[0]);
        }
        
        // 각 노드를 탐색
        for(int i = 0; i < n; i++) {
            // 처음 방문 한 노드인 경우 다른 노드와 연결되어 있지 않았던 경우이므로 정답 카운트 증가
            // 단, 최초 탐색인 경우 항상 방문 여부가 false이므로 정답 카운트는 -1부터 시작
            // 현재 노드는 방문 처리하고 현재 노드와 연결된 모든 노드 탐색
            if(!visited[i]) {
                answer++;
                visited[i] = true;
                dfs(i);
            }
        }

        return answer;
    }

    public void dfs(int node) {
        // 현재 노드와 연결되어 있는 이웃 노드 탐색
        for(int neighbor : graph.get(node)) {
            // 처음 방문하는 노드인 경우 방문여부를 true로 바꾸고 다음 노드 탐색
            if(!visited[neighbor]) {
                visited[neighbor] = true;
                dfs(neighbor);
            }
        }
    }
}