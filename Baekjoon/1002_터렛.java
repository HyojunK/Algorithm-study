import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		int distance = 0;
		int point = 0;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			distance = (int)(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
			
			if(distance == 0 && r1 == r2) {//중심이 같고, 반지름도 같을 때
				point = -1;
			}
			else if(distance < Math.pow((r1 - r2), 2)) {//한 원이 다른 원 안에 있으나, 내접하지 않을 때
				point = 0;
			}
			else if(distance == Math.pow((r1 - r2), 2)) {//한 원이 다른 원 안에 내접할 때
				point = 1;
			}
			else if(distance > Math.pow(r1 + r2, 2)) {//원이 외접하지 않을 때
				point = 0;
			}
			else if(distance == Math.pow(r1 + r2, 2)) {//원이 외접할 때
				point = 1;
			}
			else {//교점이 두개일 때
				point = 2;
			}
			
			System.out.println(point);
		}
		
	}
}//class end