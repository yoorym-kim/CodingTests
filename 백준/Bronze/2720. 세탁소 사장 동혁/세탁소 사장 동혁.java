import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());

            int quarters = C / 25;
            C %= 25;

            int dimes = C / 10;
            C %= 10;

            int nickels = C / 5;
            C %= 5;

            int pennies = C;

            sb.append(quarters).append(" ")
              .append(dimes).append(" ")
              .append(nickels).append(" ")
              .append(pennies).append("\n");
        }
        System.out.print(sb);
    }
}
