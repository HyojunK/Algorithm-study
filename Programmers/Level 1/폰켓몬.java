import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        
        return Math.min(answer, set.size());
    }
}