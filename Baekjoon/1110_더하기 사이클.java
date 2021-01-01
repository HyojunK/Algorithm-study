import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;//입력값 저장
		num = scan.nextInt();
		int result = num;//최종결과
		int count = 0;//반복횟수
		
		while(true) {//while
			int a = result/10;//십의자리
			int b = result%10;//일의자리
			result = a+b;
			result = (b*10)+(result%10);
			count++;//카운트 증가
			
			if(result == num) {//if
				break;
			}//if 끝
			
		}//while 끝
		System.out.println(count);
	}

}