class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int size = num_list.length;
        for(int i=0; i<num_list.length; i++){
            if(size >= 11 ){
                answer += num_list[i];
        }else{
                if(i == 0) answer = 1;
                answer *= num_list[i];
            }
        }
        return answer;
    }
}