class Solution {
    public int solution(int order) {
        int answer = 0;
        String num = Integer.toString(order);
        String[] numArr = num.split("");
        
        for(int j=0;j<numArr.length;j++) {
        	if(numArr[j].equals("3") || numArr[j].equals("6") || numArr[j].equals("9")) {
        			answer++;
        	}
        }
        return answer;
     }
}
