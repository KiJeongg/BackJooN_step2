//백준 9506번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) break;

            int sum = 0;
            ArrayList<Integer> divisors = new ArrayList<>();

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    divisors.add(i);
                }
            }

            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    if (i == divisors.size() - 1) {
                        System.out.println(divisors.get(i));
                    } else {
                        System.out.print(divisors.get(i) + " + ");
                    }
                }
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}