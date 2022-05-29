import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                ){
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st;
            int[][] arr = new int[N][2];
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine(), " ");
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            for(int i = 0; i < N; i++){
                int rank = 1;
                for(int j = 0; j < N; j++){
                    if(i != j && arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1]){
                        rank += 1;
                    }
                }
                System.out.printf("%d ",rank);
            }

        } catch (IOException e) {

        }
    }
}
