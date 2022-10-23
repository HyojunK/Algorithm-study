class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int a1 = common[0]; // 첫번째항
        int comm = 0; // 공차 혹은 공비
        if(common[1] - common[0] == common[2] - common[1]){ // 등차수열인 경우
            comm = common[1] - common[0];
            answer = a1 + (common.length) * comm;
        } else { // 등비수열인 경우
            comm = common[1] / common[0];
            answer = a1 * (int)Math.pow(comm, common.length);
        }
        
        return answer;
    }
}