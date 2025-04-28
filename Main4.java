//백준 1978번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
         String[] s = br.readLine().split(" ");
         int count = 0;

        for (int i = 0; i < s.length; i++) {
            int num = Integer.parseInt(s[i]);
            boolean isPrime = true;

            if (num == 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}
