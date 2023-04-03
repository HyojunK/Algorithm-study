class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int answer = 0;
        
        // 사람들을 무게순으로 정렬
        Arrays.sort(people);
        
        // 왼쪽 인덱스
        int left = 0;
        // 오른쪽 인덱스
        int right = people.length - 1;
        
        // 왼쪽과 오른쪽 인덱스가 교차할 때까지 반복
        while(left <= right) {
            answer++;
            
            // 왼쪽과 오른쪽 인덱스가 같은 경우 탐색 종료
            if(left == right) break;
            
            // 오른쪽 사람의 무게와 왼쪽 사람의 무게 합이 limit 이하인 경우 양쪽인덱스를 모두 이동
            if(people[right] + people[left] <= limit) {
                right--;
                left++;
            }
            // 오른쪽 사람의 무게와 왼쪽 사람의 무게 합이 limit 초과하는 경우 오른쪽 인덱스만 이동
            else right--;;
        }

        return answer;
    }
}