import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());

        int group = 1;
        int sum = 1;

        while (sum < X) {
            group++;
            sum += group;
        }

        int indexInGroup = X - (sum - group);

        int numerator, denominator;
        if (group % 2 == 1) {
            numerator = group - (indexInGroup - 1);
            denominator = indexInGroup;
        } else {
            numerator = indexInGroup;
            denominator = group - (indexInGroup - 1);
        }

        System.out.println(numerator + "/" + denominator);
    }
}
