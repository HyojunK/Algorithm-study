class Solution {
    public int[] solution(int[] numlist, int n) {
        bubbleSort(numlist, numlist.length, n);
        
        return numlist;
    }
    
    /**
     * @param arr       정렬할 대상 배열
     * @param length    배열의 길이
     * @param n         정렬의 기준이 되는 수
     */
    public void bubbleSort(int[] arr, int length, int n) {
        for(int i = 1; i < length; i++) {
            for(int j = 0; j < length - i; j++) {
                /*
                 * n으로 부터 현재원소의 거리가 다음 원소의 거리보다 클 경우
                 * 원소의 위치를 교환
                 */ 
                if(Math.abs(n - arr[j]) > Math.abs(n - arr[j + 1])) {
                    swap(arr, j, j + 1);
                } 
                /*
                 * n으로 부터 현재원소의 거리가 다음 원소의 거리와 같은 경우
                 * 값이 큰 요소가 앞으로 오도록 교환
                 */
                else if(Math.abs(n - arr[j]) == Math.abs(n - arr[j + 1]) && arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    
    // 정렬 내 요소 교환 a <-> b
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}