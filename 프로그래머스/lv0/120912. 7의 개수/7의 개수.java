class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++) {
			String num = Integer.toString(array[i]);
			String[] array2 = num.split("");
			
			for(int j=0; j<array2.length; j++) {
				if(num.matches(".*7.*")) {
            answer++;
        }
			}
		}
		return answer;
	}

}