import java.util.Arrays;
class Solution {
    public String solution(String a) {
    a = a.toLowerCase();
	char[] stringChar = a.toCharArray();
    Arrays.sort(stringChar);
	String answer = "";
	
	answer = new String(stringChar);
    
        return answer;
    }
}