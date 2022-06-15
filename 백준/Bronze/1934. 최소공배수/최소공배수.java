import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            int N = Integer.parseInt(br.readLine());

            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                int gcd = gcd(A, B);
                int lcm = A * B / gcd;

                sb.append(lcm).append("\n");
            }
            System.out.print(sb);

        } catch (IOException e){

        }
    }
    public static int gcd(int A, int B){
        if(B == 0) {
            return A;
        }
        return gcd(B, A % B);
    }

}
