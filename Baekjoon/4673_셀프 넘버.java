public class Main {

	public static void main(String[] args) {
		boolean[] selfNum = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int dn = getdn(i);
			if(dn <= 10000) {
				selfNum[dn] = true;
			}
		}
		for(int i = 1; i < selfNum.length; i++) {
			if(!selfNum[i]) {
				System.out.println(i);
			}
		}
	}//main end

	private static int getdn(int i) {
		int dn = i + i/1000 + (i%1000)/100 + (i%100)/10 + i%10;
		
		return dn;
	}
}//class end
