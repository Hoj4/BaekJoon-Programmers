import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> unfinishedList = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                unfinishedList.add(todo_list[i]);
            }
        }

        // 배열로 변환
        String[] answer = unfinishedList.toArray(new String[0]);
        return answer;
    }
}