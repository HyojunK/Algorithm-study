import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        //문자열 내림차순 정렬, (a + b) 와 (b + a) 크기 비교
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return (b + a).compareTo(a + b);
            }
        });
        
        //가장 큰 값이 0이면 0을 리턴
        if(arr[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        //아니면 문자열을 더하여 리턴
        for(String s : arr) sb.append(s);
        
        return sb.toString();
    }
}