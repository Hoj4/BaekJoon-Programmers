import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        List<Integer> result = new ArrayList<>();
        int currentLength = 0;

        for (char c : myString.toCharArray()) {
            if (c == 'x') {
                result.add(currentLength);
                currentLength = 0;
            } else {
                currentLength += 1;
            }
        }

        result.add(currentLength);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}