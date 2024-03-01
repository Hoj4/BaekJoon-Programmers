import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        if (num_list.length < 2) {
            return num_list;
        }

        int last = num_list[num_list.length - 1];
        int prev = num_list[num_list.length - 2];

        List<Integer> tempList = new ArrayList<>();
        for (int num : num_list) {
            tempList.add(num);
        }

        if (last > prev) {
            tempList.add(last - prev);
        } else {
            tempList.add(last * 2);
        }

        int[] result = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            result[i] = tempList.get(i);
        }

        return result;
    }
}