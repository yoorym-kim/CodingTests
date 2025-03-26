import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] sticks = new int[3];
        for (int i = 0; i < 3; i++) {
            sticks[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(sticks);

        if (sticks[2] >= sticks[0] + sticks[1]) {
            sticks[2] = sticks[0] + sticks[1] - 1;
        }

        int sum = sticks[0] + sticks[1] + sticks[2];
        System.out.println(sum);
    }
}
