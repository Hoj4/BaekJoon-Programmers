import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] nums = new int[N];
		for (int i = 0; i < N; i++)
			nums[i] = Integer.parseInt(input[i]);
		int[] copyNums = nums.clone();
		Arrays.sort(nums);
		Map<Integer, Integer> hmap = new HashMap<>();
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!hmap.containsKey(nums[i]))
				hmap.put(nums[i], cnt++);
		}
		for (int i = 0; i < N; i++) {
			sb.append(hmap.get(copyNums[i])).append(" ");
		}
		System.out.println(sb.toString());
	}
}
