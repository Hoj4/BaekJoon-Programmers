import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int[] arr = new int[26];
		// 알파벳 갯수가 들어갈 배열 생성
		String s = in.next();
		// 단어 받아오기
 
		for (int i = 0; i < s.length(); i++){
		// 단어의 길이만큼 반복
 
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { 
				arr[s.charAt(i) - 'A']++;
			}
			// 각각의 배열에 넣기
    
			else {	
				arr[s.charAt(i) - 'a']++;
			// 대문자와 소문자를 같은 알파벳의 배열에 넣기 위해서 -'a'
			}
		}
 
 
		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
 
		System.out.print(ch);
	}
}