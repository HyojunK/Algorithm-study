import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		int time = 0;
		
		for(int i = 0; i < word.length(); i++) {
			char chNum = word.charAt(i);
			
			if(chNum == 90) {
				chNum -= 2;
			}
			else if(chNum >= 83) {
				chNum--;
			}
			int num = (chNum-65)/3;
			
			time += num+3;
		}
		
		System.out.println(time);
	}//main 끝
}//class 끝