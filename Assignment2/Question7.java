import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total sweets (n): ");
        int n = sc.nextInt();
        System.out.print("Enter number of sweet types (k): ");
        int k = sc.nextInt();

        int maxTypes = Math.min(n / 2, k);
        System.out.println("Max different types Soham can eat: " + maxTypes);

        List<String> types = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            types.add("Type" + i);
        }

        System.out.println("Some combinations:");
        for (int i = 0; i < maxTypes && i < types.size(); i++) {
            System.out.println(types.get(i));
        }
    }
}
