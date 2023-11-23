class Solution {
    public int[] solution(int[] arr) {
         if (arr.length == 1) {
            int[] answer_one = {-1};
             // 입력 배열의 길이가 1이라면 결과로 {-1} 배열을 반환, 그 외의 경우는 가장 작은 값(min)을 제외한 배열을 만들어 반환
            return answer_one;
        }

        int[] answer = new int[arr.length-1];
        
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        int answer_num = 0;
        for (int j=0; j< arr.length; j++){
            if (arr[j]==min){
                continue;
            }
            else{
                answer[answer_num++] = arr[j];
            }
        }
        return answer;
    }
}