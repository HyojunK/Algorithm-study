class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int xMax = board[0] / 2;
        int xMin = xMax * -1;
        int yMax = board[1] / 2;
        int yMin = yMax * -1;
        int x = 0;
        int y = 0;
        
        for(String s : keyinput){
            switch(s){
                case "up" :
                    if(yMax > y) y++;
                    break;
                case "down":
                    if(yMin < y) y--;
                    break;
                case "left" :
                    if(xMin < x) x--;
                    break;
                case "right" :
                    if(xMax > x) x++;
                    break;
            }
        }
        int[] answer = {x, y};
        
        return answer;
    }
}