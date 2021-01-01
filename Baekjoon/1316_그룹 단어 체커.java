import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine());
		int cnt = n;

		for(int i = 0; i < n; i++) {
			String word = scan.nextLine();

			int[] abc = new int[26];

			for(int j = 1; j < word.length(); j++) {
				if(word.charAt(j-1) != word.charAt(j)) {
					if(abc[word.charAt(j) - 'a'] == 1) {
						cnt--;
						break;
					}
					abc[word.charAt(j-1) - 'a'] = 1;
				}
			}
		}
		System.out.println(cnt);
	}//main end
}//class end