import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
         // 공백을 기준으로 나누기
        String[] words = my_string.split("\\s+");
        List<String> resultList = new ArrayList<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                resultList.add(word);
            }
        }

        String[] answer = resultList.toArray(new String[0]);
        
        return answer;
    }
}