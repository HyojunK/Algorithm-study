import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] str1 = br.readLine().toCharArray();
		char[] str2 = br.readLine().toCharArray();
		
		int[][] data = new int[str1.length + 1][str2.length + 1];
		
		for(int i = 1; i <= str1.length; i++) {
			for(int j = 1; j <= str2.length; j++) {
				
				//(i-1)과 (j-1)번째 문자가 같으면
				if(str1[i - 1] == str2[j - 1]) {
					//현재 데이터 + 1값을 다음 데이터에 추가
					data[i][j] = data[i - 1][j - 1] + 1;
				}
				
				else {//다르면 (i-1)과 (j-1)번째 데이터중 큰값으로 갱신
					data[i][j] = Math.max(data[i - 1][j], data[i][j - 1]);
				}
			}
		}
		//마지막 데이터 값 출력
		System.out.println(data[str1.length][str2.length]);
	}
}//class end