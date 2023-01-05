import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); // 반복횟수 정하기

		for (int i = 0; i < n; i++) {
			
			StringTokenizer string = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(string.nextToken());
			// 입력값 중 첫번째를 토큰에 담기
			int b = Integer.parseInt(string.nextToken());
			// 입력값 중 두번째를 토큰에 담기
			bw.write(a+b+"\n");
            // BufferedReader 는 println 같은 줄바꿈기능이 없기 때문에 확장열인 /n 을 넣어서 개행
		}
		bw.flush();
	}
}