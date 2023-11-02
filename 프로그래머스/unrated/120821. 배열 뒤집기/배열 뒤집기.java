import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        Integer[] list=Arrays.stream(num_list).boxed().toArray(Integer[]::new);
        List<Integer> list2=Arrays.asList(list);
        Collections.reverse(list2);
        for(int i=0;i<num_list.length;i++){
            answer[i]=list2.get(i);
        }
        return answer;
    }
}
