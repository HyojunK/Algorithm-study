import java.io.*;

public class Main {
	
	static int[] data = new int[1000001];
	static int n;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		data[0] = 0;
		data[1] = 1;
		data[2] = 2;
		
		//나머지 값 초기화
		for(int i = 3; i < data.length; i++) {
			data[i] = -1;
		}
		
		n = Integer.parseInt(br.readLine());
		
		System.out.println(binary(n));
	}

	private static int binary(int n) {
		//저장된 데이터가 없으면 탐색 후 저장
		if(data[n] == -1) {
			data[n] = ((binary(n - 1) + binary(n - 2))) % 15746;
		}
		//저장된 값이 있으면 값을 리턴
		return data[n];
	}
}//class end