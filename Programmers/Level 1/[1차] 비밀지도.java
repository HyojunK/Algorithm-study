class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			
			int[] str1 = toBinary(arr1[i], n);
			int[] str2 = toBinary(arr2[i], n);
			
			for(int j = 0; j < n; j++) {
				if(str1[j] == 0 && str2[j] == 0) {
					sb.append(" ");
				}
				else sb.append("#");
			}
			answer[i] = sb.toString();
		}
        
        return answer;
    }
    
    private static int[] toBinary(int dec, int n) {
		int[] bin = new int[n];
		for(int i = n - 1; i >= 0; i--) {
			bin[i] = dec%2;
			dec /= 2;
		}
		
		return bin;
	}
}