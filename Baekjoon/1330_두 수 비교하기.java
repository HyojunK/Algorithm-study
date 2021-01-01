import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b = 0;
        a = scan.nextInt();
        b = scan.nextInt();
        
        if(a>b) {
            System.out.println(">");
        }
        else if(a<b) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }
    }
}