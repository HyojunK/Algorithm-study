import java.util.*;

class Solution {
    static boolean[] prime;
    
    public int solution(String numbers) {
        int answer = 0;
        
        prime = new boolean[10000001];
		//소수 판별 알고리즘
		isPrime();
		
		String[] s = numbers.split("");
		Set<Integer> set = new HashSet<>();
		//순열 알고리즘 (1자리 수부터 최대길이 만큼)
		for(int i = 1; i <= s.length; i++) {
			perm(s, 0, i, set);
		}
		
		answer = set.size();
        
        return answer;
    }
    //순열 알고리즘
	private static void perm(String[] s, int depth, int k, Set<Integer> set) {
		/*
		 * s = 숫자를 뽑아올 배열
		 * depth = 탐색 깊이
		 * k = 뽑아올 숫자의 갯수
		 * set = 생성된 순열 데이터
		 */
		if(depth == k) { //원하는 개수의 숫자까지 탐색하면 종료
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < k; i++) {
				sb.append(s[i]);
			}
			int num = Integer.parseInt(sb.toString());
			//소수 판단
			if(!prime[num]) {
				set.add(num);
				return;
			}
		}
		else {
			for(int i = depth; i < s.length; i++) {
				swap(s, i, depth);
				perm(s, depth + 1, k, set);
				swap(s, i, depth);
			}
		}
	}

	//스왑 알고리즘
	private static void swap(String[] s, int i, int depth) {
		String temp = s[i];
		s[i] = s[depth];
		s[depth] = temp;
	}

	//소수 판별 알고리즘
	private static void isPrime() {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i < Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				continue;
			}
			for(int j = i + i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
		
	}
}