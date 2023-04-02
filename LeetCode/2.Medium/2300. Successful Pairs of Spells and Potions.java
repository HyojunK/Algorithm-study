class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        // potions 배열 오름차순으로 정렬
        Arrays.sort(potions);
        
        // spells 배열의 모든 요소 탐색
        for(int i = 0; i < spells.length; i++) {
            // 이진 탐색으로 개수를 구하여 spells 배열에 값 업데이트
            spells[i] = binarySearch(spells[i], potions, success);
        }

        // 업데이트된 spells 배열을 return
        return spells;
    }

    // 이분 탐색
    public int binarySearch(int spell, int[] potions, long target) {
        // 정렬된 potions 배열의 마지막 요소와 spell의 곱이 target보다 작은 경우 0을 return
        if((long)potions[potions.length - 1] * spell < target) return 0;
        // 정렬된 potions 배열의 첫번째 요소와 spell의 곱이 target 이상인 경우 potions 배열 길이를 return
        if((long)potions[0] * spell >= target) return potions.length;

        // target 이상이 되는 potions 요소의 개수
        int result = 0;
        // 시작지점 인덱스
        int start = 0;
        // 종료지점 인덱스
        int end = potions.length - 1;
        // 중간지점 인덱스
        int mid;
        
        // 시작지점과 종료지점이 교차할 때 까지 반복
        while(start <= end) {
            // 중간지점 인덱스 계산
            mid = (start + end) / 2;
            
            // potions의 중간지점의 값과 spell의 곱이 target보다 크거나 같고
            // potions의 중간지점의 이전 값과 spell의 곱이 target보다 작은 경우
            // 중간 지점부터 끝까지의 값을 result에 저장하고 탐색 종료
            if((long)potions[mid] * spell >= target && (long)potions[mid - 1] * spell < target) {
                result = potions.length - mid;
                break;
            }
            // potions의 중간지점의 값과 spell의 곱이 target보다 작은 경우
            // 시작지점을 중간지점 뒤로 설정
            else if((long)potions[mid] * spell < target) {
                start = mid + 1;
            }
            // 나머지 경우 종료지점을 중간지점 앞으로 설정
            else {
                end = mid - 1;
            }
        }
        
        return result;
    }
}