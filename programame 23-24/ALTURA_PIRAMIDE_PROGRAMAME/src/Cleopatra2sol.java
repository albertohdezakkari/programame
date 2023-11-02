import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Cleopatra2sol{



    public static int solve(int num) {
        int m = 0;
        int n = 1;
        int niv = 0;

        while (m < num) {
            m += n * n;
            n += 2;
            niv++;
        }

        return niv;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int num = Integer.parseInt(in.readLine().trim());
            if (num == 0) break;

            out.write(Integer.toString(solve(num)));
            out.newLine();
        }

        out.flush();
    }
}