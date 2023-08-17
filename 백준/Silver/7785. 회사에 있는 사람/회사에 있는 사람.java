import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Set<String> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            String enter = input[1];

            if (enter.equals("enter")) {
                hs.add(name);
            } else {
                hs.remove(name);
            }
        }

        List<String> sortedList = new ArrayList<>(hs);
        Collections.sort(sortedList, Collections.reverseOrder());

        for (String person : sortedList) {
            System.out.println(person);
        }
    }
}