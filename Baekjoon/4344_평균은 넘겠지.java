import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			int total = 0;
			double avg = 0;
			int stu = 0;
			
			int sNum = scan.nextInt();
			int[] scores = new int[sNum];
			
			for(int j = 0; j < sNum; j++) {
				
				int score = scan.nextInt();
				scores[j] = score;
				total += score;
			}
			for(int k = 0; k < sNum; k++) {
				if(scores[k] > total/sNum) {
					stu++;
				}
			}
			avg = (double)stu/sNum*100;
			System.out.println(String.format("%.3f", avg) + "%");
		}
	}//main end
}//class end