import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word1 = sc.nextLine().toCharArray();
        char[] word2 = sc.nextLine().toCharArray();
        int[] charCount = new int[26];

        for(char c:word1) charCount[c -97]++;
        for(char c:word2) charCount[c -97]--;

        System.out.print(Arrays.stream(charCount).map(Math::abs).sum());
    }
}
