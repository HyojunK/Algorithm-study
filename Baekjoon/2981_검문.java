import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int gcdVal = arr[1] - arr[0];
		
		for(int i = 2; i < N; i++) {
			gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
		}
		
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//최대공약수의 약수
		for(int i = 2; i <= Math.sqrt(gcdVal); i++) {

			if(i * i == gcdVal) {
				list.add(i);
			}
			else if(gcdVal % i == 0) {
				list.add(i);
				list.add(gcdVal / i);
			}
		}
		Collections.sort(list);
		for(int val : list) {
			sb.append(val).append(" ");
		}
		
		//마지막 최대공약수 추가
		sb.append(gcdVal);
		
		System.out.println(sb);
	}

	private static int gcd(int a, int b) {
		int r = a % b;
		if(r == 0) return b;
		else return gcd(b, r);
	}
}//class end