import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static int[][] studentCount;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        studentCount = new int[2][7];

        int minRoom = 0;
        int male,grade;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            male = Integer.parseInt(st.nextToken());
            grade = Integer.parseInt(st.nextToken());

            studentCount[male][grade-1]++;
        }

        for(int[] arr:studentCount){
            for(int a:arr){
                if(a == 0) continue;
                minRoom += a/K;
                if(a%K != 0) minRoom += 1;
            }
        }

        bw.write(String.valueOf(minRoom));
        bw.flush();
        bw.close();
    }
}
