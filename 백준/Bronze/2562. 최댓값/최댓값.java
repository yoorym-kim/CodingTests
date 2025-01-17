import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte[] arr = new byte[9];
        int i = 0;
        int j = 0;
        byte max = 0;

        do {
            i++;
            byte num = Byte.parseByte(br.readLine());
            if (max <= num ) {
                max = num;
                j = i;
            }
        } while (i < 9);

        System.out.println(max);
        System.out.println(j);
    }
}