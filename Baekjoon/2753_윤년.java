import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int year = 0;
        String result = null;
        
        year = scan.nextInt();
        
        if((year%4 == 0 && year%100 != 0) || year%400 == 0 ) {
            result = "1";
        }
        else {
            result = "0";
        }
        System.out.println(result);
        
    }
}