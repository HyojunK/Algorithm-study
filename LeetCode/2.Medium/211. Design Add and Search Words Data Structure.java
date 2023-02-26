public class Node {
    // 현재 노드까지가 단어인지 아닌지 판단할 변수
    boolean isWord;
    // 현재 노드의 자식노드를 저장할 Map
    Map<Character, Node> children = new HashMap<>();
}

class WordDictionary {
    // 노드 변수 선언
    Node root;
    
    public WordDictionary() {
        // 새로운 루트 노드 생성
        root = new Node();
    }
    
    public void addWord(String word) {
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
        return dfs(root, word, 0);
    }
    
    public boolean dfs(Node root, String word, int idx) {
        // 문자열을 끝까지 탐색한 경우 단어 여부에 따라 결과값을 return
        if(idx == word.length()) return root.isWord;
        
        // 현재 탐색중인 문자
        Character c = word.charAt(idx);
        
        // 현재 탐색중인 문자가 '.'인 경우
        if(c == '.') {
            // 현재 노드의 자식노드들을 탐색하여 true가 되는 경우 true를 return
            for(Character key : root.children.keySet()) {
               if(dfs(root.children.get(key), word, idx + 1)) return true;
            }
        }
        // 현재 탐색중인 문자가 알파벳인 경우
        else {
            // 자식노드에 현재 탐색중인 문자가 존재하지 않는 경우 false를 return
            if(root.children.get(c) == null) return false;
            // 자식노드에 현재 탐색중인 문자가 존재하는 경우 다음 레벨을 탐색
            return dfs(root.children.get(c), word, idx + 1);
        }
        
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */