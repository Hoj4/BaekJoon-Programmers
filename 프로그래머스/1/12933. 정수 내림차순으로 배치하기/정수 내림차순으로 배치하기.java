import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;

        String nString = Long.toString(n); // 문자열로 바꾸기
        String[] arr = new String[nString.length()];  // 배열 생성
        String result = "";

        for (int i=0; i<nString.length(); i++) {
            arr[i] = nString.substring(i, i+1);
        }  // 한 숫자씩 배열에 담기

        Arrays.sort(arr, Collections.reverseOrder());
         // 내림차순으로 정렬
        result = String.join("", arr); 
         // 숫자들을 다시 문자열로 변환

        return Long.parseLong(result);
    }
}