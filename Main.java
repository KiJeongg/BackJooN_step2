//백준 10798번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] lines= new String[5];

        for (int i = 0; i < 5; i++) {
            lines[i] = br.readLine();
        }

        for (int col = 0; col < 15; col++) {
            for (int row = 0; row < 5; row++) {
                if (col < lines[row].length()) {
                    sb.append(lines[row].charAt(col));
                }
            }
        }

        System.out.println(sb);

    }
}