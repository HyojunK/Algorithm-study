class Solution {
    public String solution(String s) {
        
        boolean upperCase = true;
		String[] arr = s.split("");
		

		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(" ")) {
				upperCase = true;
				sb.append(" ");
				continue;
			}
			if(upperCase) {
				arr[i] = arr[i].toUpperCase();
				sb.append(arr[i]);
				upperCase = false;
			}
			else if(!upperCase) {
				arr[i] = arr[i].toLowerCase();
				sb.append(arr[i]);
				upperCase = true;
			}
		}
        
        return sb.toString();
    }
}