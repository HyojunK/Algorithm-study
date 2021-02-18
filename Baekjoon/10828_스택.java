import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] stack = new int[N];
		int size = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			switch (st.nextToken()) {
			case "push":
				stack[size] = Integer.parseInt(st.nextToken());
				size++;
				break;
			case "pop":
				int pop = -1;
				if(size != 0) {
					pop = stack[size - 1];
					stack[size - 1] = 0;
					size--;
				}
				sb.append(pop).append("\n");
				break;
			case "size":
				sb.append(size).append("\n");
				break;
			case "empty":
				int empty = (size == 0)? 1 : 0;
				sb.append(empty).append("\n");
				break;
			case "top":
				int top = -1;
				if(size != 0) {
					top = stack[size - 1];
				}
				sb.append(top).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
}//class end