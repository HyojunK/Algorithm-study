import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		int left = 0;
		
		left = scan.nextInt();
		
		for(int right = 1; right <= 9; right++) {
			System.out.printf("%d * %d = %d", left, right, (left*right));
			System.out.println();
		}
    }
    
}