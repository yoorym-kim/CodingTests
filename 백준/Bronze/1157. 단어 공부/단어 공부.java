import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase(); // 모두 대문자로
        int[] arr= new int[26]; // 알파벳 26개

        for (int i = 0; i < input.length(); i++) {
            arr[input.charAt(i)-'A']++;
        }

        int maxCount = 0;
        char maxAlphabet = ' ';
        boolean moreThanOne = false;
        for (int i = 0; i < 26; i++) {
            if(arr[i]>maxCount) {
                maxCount = arr[i];
                maxAlphabet = (char) (i+'A');
                moreThanOne = false;
            } else if(arr[i]==maxCount) {
                moreThanOne = true;
            }
        }

        System.out.println(moreThanOne ? "?" : maxAlphabet);
    }
}
