import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	static int[] deque;
	static int f_index;
	static int b_index;
	static int size = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		deque = new int[2*N]; //front 최대 명령수 15 + back 최대 명령수 15
		f_index = N - 1; //front 위치
		b_index = N; //back 위치
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			
			switch (s) {
			case "push_front":
				push_front(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				push_back(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				sb.append(pop_front()).append("\n");
				break;
			case "pop_back":
				sb.append(pop_back()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "front":
				sb.append(front()).append("\n");
				break;
			case "back":
				sb.append(back()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}

	private static void push_front(int n) {
		deque[f_index] = n;
		f_index--;
		size++;
	}

	private static void push_back(int n) {
		deque[b_index] = n;
		b_index++;
		size++;
	}

	private static int pop_front() {
		if(size == 0) {
			return -1;
		}
		else {
			int res = deque[f_index + 1];
			f_index++;
			size--;
			return res;
		}
	}

	private static int pop_back() {
		if(size == 0) {
			return -1;
		}
		else {
			int res = deque[b_index - 1];
			b_index--;
			size--;
			return res;
		}
	}

	private static int size() {
		return size;
	}

	private static int empty() {
		return (size == 0)? 1 : 0;
	}

	private static int front() {
		if(size == 0) {
			return -1;
		}
		else {
			return deque[f_index + 1];
		}
	}

	private static int back() {
		if(size == 0) {
			return -1;
		}
		else {
			return deque[b_index - 1];
		}
	}

}//class end