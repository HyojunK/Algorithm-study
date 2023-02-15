// 트리 노드
class Node {
    // 현재 노드까지가 단어인지 아닌지 판단할 변수
    boolean isWord;
    // 현재 노드의 자식노드를 저장할 Map
    Map<Character, Node> children = new HashMap<>();
}

class Trie {
    // 노드 변수 선언
    Node root;

    public Trie() {
        // 새로운 루트 노드 생성
        root = new Node();
    }
    
    public void insert(String word) {
        // 트리 최상위 노드
        Node node = root;

        // 문자열 끝까지 탐색
        for(int i = 0; i < word.length(); i++){
            // 현재 탐색중인 문자
            Character c = word.charAt(i);
            // 자식 노드에 현재 탐색중인 문자가 없는 경우
            if(!node.children.containsKey(c)){
                // 노드를 새로 생성하고 자식노드에 삽입
                node.children.put(c, new Node());
            } 

            // 노드를 갱신
            node = node.children.get(c);
            // 문자열을 끝까지 탐색한 경우 단어 여부 업데이트
            if(i == word.length() - 1){
                node.isWord = true;
            }
        }
    }
    
    public boolean search(String word) {
        // 트리 최상위 노드
        Node node = root;

        // 문자열 끝까지 탐색
        for(int i = 0; i < word.length(); i++){
            // 현재 탐색중인 문자
            Character c = word.charAt(i);
            // 자식 노드에 현재 탐색중인 문자가 존재하는 경우
            // 해당 자식노드로 노드 갱신
            if(node.children.containsKey(c)) node = node.children.get(c);
            // 자식 노드에 현재 탐색중인 문자가 존재하지 않는 경우 false를 return
            else return false;
        }
        
        // 마지막까지 탐색 후 현재 노드까지 단어가 존재하면 true 존재하지않으면 false를 return
        return node.isWord? true : false;
    }
    
    public boolean startsWith(String prefix) {
        // 트리 최상위 노드
        Node node = root;

        // 문자열 끝까지 탐색
        for(int i = 0; i < prefix.length(); i++){
            // 현재 탐색중인 문자
            Character c = prefix.charAt(i);
            // 자식 노드에 현재 탐색중인 문자가 존재하는 경우
            // 해당 자식노드로 노드 갱신
            if(node.children.containsKey(c)) node = node.children.get(c);
            // 자식 노드에 현재 탐색중인 문자가 존재하지 않는 경우 false를 return
            else return false;
        }
        
        // prefix 마지막 까지 탐색을 했다면 해당 prefix로 시작하는 단어 존재
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */