class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        int[] point = new int[3];
		int index = 0;

		String temp = "";
		for(int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i);
			if(c >= '0' && c <= '9') {
				temp += String.valueOf(c);
			}
			else if(c == 'S' || c == 'D' || c =='T') {
				int value = Integer.parseInt(temp);
				
				switch(c) {
				case 'S': value = (int)Math.pow(value, 1);
					break;
				case 'D': value = (int)Math.pow(value, 2);
					break;
				case 'T': value = (int)Math.pow(value, 3);
					break;
				}
				
				point[index++] = value;
				temp = "";
			}
			else {
				if(c == '#') {
					point[index - 1] *= -1;
				}
				else {
					point[index - 1] *= 2;
					if(index - 2 >= 0) point[index - 2] *= 2;
				}
			}
		}
		
		for(int sum : point) {
			answer += sum;
		}
        
        return answer;
    }
}