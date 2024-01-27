import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length-1; i++){
            // 현재 원소와 다음 원소가 다를 경우 list에 추가
            if(arr[i] != arr[i+1])
                list.add(arr[i]);
            // 배열의 마지막 원소
            if(i == arr.length - 2)
                list.add(arr[arr.length - 1]);
        }

        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}