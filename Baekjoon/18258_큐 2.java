import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] queue = new int[2000000]; //명령어의 최대 개수
		int size = 0;
		int front = 0;
		int back = 0;
		
		StringBuilder sb = new StringBuilder();
				
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			switch (st.nextToken()) {
			case "push":
				queue[back] = Integer.parseInt(st.nextToken());
				size++;
				back++;
				break;
			case "pop":
				int pop = -1;
				if(size != 0) {
					pop = queue[front];
					size--;
					front++;
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
			case "front":
				int f = -1;
				if(size != 0) {
					f = queue[front];
				}
				sb.append(f).append("\n");
				break;
			case "back":
				int b = -1;
				if(size != 0) {
					b = queue[back - 1];
				}
				sb.append(b).append("\n");
				break;
			}
		}
		
		System.out.println(sb);
	}
}//class end