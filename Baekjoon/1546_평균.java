import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float max = 0;
		float total = 0;

		int size = scan.nextInt();

		float[] score = new float[size];

		for(int i = 0; i < size; i++) {
			score[i] = scan.nextInt();
			if(score[i] > max) {
				max = score[i];

			}
		}

		for(int i = 0; i < size; i++) {

			score[i] = score[i]/max*100;
			total += score[i];
		}

		System.out.println(total/size);

	}//main end
}//class end