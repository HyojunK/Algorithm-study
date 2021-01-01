import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int h,m = 0;
		
		h = scan.nextInt();
		m = scan.nextInt();
		
		if(m - 45 < 0) {
			m = m + 60 - 45;
			if(h == 0) {
				h = 23;
			}
			else {
				h = h - 1;
			}
		}
		else {
			m = m - 45;
		}
		
		System.out.println(h + " " + m);
    }
    
}