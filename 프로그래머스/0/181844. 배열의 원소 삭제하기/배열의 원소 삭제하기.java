import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> toDelete = new ArrayList<>();
        
        for (int num : delete_list) {
            toDelete.add(num);
        }
        
        List<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            if (!toDelete.contains(num)) {
                result.add(num);
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}