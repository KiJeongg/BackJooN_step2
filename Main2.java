//백준 11718번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // n은 색종이 개수
        boolean[][] paper = new boolean[100][100]; // 도화지 크기

      for(int t=0; t<n; t++) {
            String[] a = br.readLine().split(" ");
            int x = Integer.parseInt(a[0]);
            int y = Integer.parseInt(a[1]);

          for (int i = x; i < x + 10; i++) {
              for (int j = y; j < y + 10; j++) {
                  paper[i][j] = true;  //
              }
          }
      }
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j])
                    area++;
            }
        }
        System.out.println(area);

    }
}
