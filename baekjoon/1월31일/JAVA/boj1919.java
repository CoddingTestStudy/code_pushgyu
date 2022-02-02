import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main{
    public static int[] CharCount;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word1 = br.readLine().trim();
        String word2 = br.readLine().trim();

        CharCount = new int[27];

        bw.write(String.valueOf(sol(word1,word2)));
        bw.flush();
        bw.close();
    }
    public static int sol(String word1, String word2){
        int CharChangeSum = 0;

        for(int index = 0; index < word1.length(); index++){
            CharCount[word1.charAt(index) - 97]++;
        }
        for(int index = 0; index < word2.length(); index++){
            CharCount[word2.charAt(index) - 97]--;
        }
        for(int i=0;i<27;i++){
            CharChangeSum += Math.abs(CharCount[i]);
        }
        return CharChangeSum;
    }
}
