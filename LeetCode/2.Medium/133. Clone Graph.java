/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    // 방문한 노드를 기억할 Map 선언
    Map<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        // 빈 값이 들어오는 경우 null을 반환
        if(node == null) return null;

        // 이미 방문한 노드인 경우 해당 노드를 반환
        if(visited.containsKey(node)){
            return visited.get(node);
        }

        // 처음 방문한 노드인 경우
        // 새로운 노드를 생성
        Node clone = new Node(node.val, new ArrayList<Node>());
        // 방문 여부 업데이트
        visited.put(node, clone);
        // 원본의 이웃 노드 탐색하며 복사본의 이웃 노드에 추가
        for(Node neighbor : node.neighbors){
            clone.neighbors.add(cloneGraph(neighbor));
        }

        // 복사본을 반환
        return clone;
    }
}