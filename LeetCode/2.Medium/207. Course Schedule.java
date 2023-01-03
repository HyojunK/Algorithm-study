class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 각 코스의 진입차수를 저장할 배열
        int[] indegree = new int[numCourses];
        
        // 주어진 prerequisites 배열을 그래프로 구현
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        
        for(int i = 0; i < prerequisites.length; i++) {
            // 시작 정점
            int start = prerequisites[i][0];
            // 종료 정점
            int end = prerequisites[i][1];
            // 시작 정점에 종료 정점 값을 추가
            graph.get(start).add(end);
            // 종료 정점에 대한 진입차수 증가
            indegree[end]++;
        }
        
        // 정렬된 그래프의 길이
        int length = 0; 
        // 정렬에 사용할 큐
        Queue<Integer> q = new LinkedList<>();
        
        // 진입차수가 0인 정점들을 큐에 삽입
        for(int i = 0; i < indegree.length; i++) {
            if(indegree[i] == 0) q.offer(i);
        }
        
        // 큐가 빌 때까지 반복
        while(!q.isEmpty()) {
            // 큐에서 노드를 꺼내고 정렬 값 증가
            int node = q.poll();
            length++;
            // 해당 노드를 시작 종점으로 하는 종료 종점들 탐색
            List<Integer> endList = graph.get(node);
            for(int end : endList) {
                // 종료 종점의 진입차수 감소 == 간선 제거
                indegree[end]--;
                // 갱신된 노드의 진입차수가 0이면 큐에 삽입
                if(indegree[end] == 0) q.offer(end);
            }
        }
        
        // 그래프의 모든 노드가 정렬이 되었다면 == 정렬된 그래프의 길이가 코스의 갯수와 같다면 
        // -> 모든 코스를 수강 가능하므로 true를 반환, 아니면 false를 반환
        return (length == numCourses) ? true : false;
    }
}