import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {

            String str = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(str, " ");
            System.out.println(st.countTokens());

        } catch (IOException e1){

        }
    }
}
