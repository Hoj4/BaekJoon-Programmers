import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = Arrays.copyOfRange(numbers, num1,num2+1);
        // Arrays.copyOfRange(원본배열, 복사범위 시작 인덱스, 복사범위 끝 인덱스+1)
        return answer;
    }
}