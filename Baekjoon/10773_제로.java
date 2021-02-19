import java.io.*;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> stack = new Stack<Integer>();
		
		int K = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for(int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0){
				sum -= stack.pop();
			}
			else {
				stack.push(num);
				sum += num;
			}
		}
		
		System.out.println(sum);
	}
}//class end