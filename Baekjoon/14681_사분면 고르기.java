import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		int x,y = 0;
		String result = null;
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		if(x>0 && y>0) {
			result = "1";
		}
		else if(x<0 && y>0) {
			result = "2";
		}
		else if(x<0 && y<0) {
			result = "3";
		}
		else {
			result = "4";
		}
		System.out.println(result);
    }   
}