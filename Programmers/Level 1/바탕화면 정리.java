class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        // 드래그 시작 y좌표 - 바탕화면의 세로길이만큼 설정
        answer[0] = wallpaper.length;
        // 드래그 시작 x좌표 - 바탕화면의 가로길이만큼 설정
        answer[1] = wallpaper[0].length();
        // 드래그 종료 y좌표 - 0으로 설정
        answer[2] = 0;
        // 드래그 종료 x좌표 - 0으로 설정
        answer[3] = 0;
        
        // 주어진 wallpaper 배열의 모든 요소를 탐색
        for(int i = 0; i < wallpaper.length; i++) {
            // 현재 탐색중인 문자
            String files = wallpaper[i];
            // 현재 탐색중인 문자의 각 자리를 탐색
            for(int j = 0; j < files.length(); j++) {
                // 탐색중인 자리에 파일(#)이 있는 경우
                if(files.charAt(j) == '#') {
                    // 드래그 시작 y좌표를 현재 파일 왼쪽 위의 y좌표와 비교하여 최소값으로 갱신
                    answer[0] = Math.min(answer[0], i);
                    // 드래그 시작 x좌표를 현재 파일 왼쪽 위의 x좌표와 비교하여 최소값으로 갱신
                    answer[1] = Math.min(answer[1], j);
                    // 드래그 종료 y좌표를 현재 파일 오른쪽 아래의 y좌표와 비교하여 최대값으로 갱신
                    answer[2] = Math.max(answer[2], i + 1);
                    // 드래그 종료 x좌표를 현재 파일 오른쪽 아래의 x좌표와 비교하여 최대값으로 갱신
                    answer[3] = Math.max(answer[3], j + 1);
                }
            }
        }
        
        return answer;
    }
}