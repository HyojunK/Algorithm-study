class Solution {
    public String solution(int[] food) {
        int quantity = 0; // 배치해야하는 음식의 수량

        StringBuilder player1 = new StringBuilder(); // 1번 선수의 음식 배치
        StringBuilder player2 = new StringBuilder(); // 1번 선수의 음식 배치

        for(int i = 1; i < food.length; i++) {
            quantity = food[i] / 2;
            for(int j = 0; j < quantity; j++) {
                player1.append(i); // 칼로리 i인 음식을 수량만큼 반복
                player2.insert(0, i); // 두 번째 선수는 앞쪽에다가 배치
            }
        }

        // player1, "0", player2를 조합
        player1.append("0").append(player2.toString());

        return player1.toString();
    }
}