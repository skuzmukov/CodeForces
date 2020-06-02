import java.io.*;

public class Task_158A {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        in.nextToken();
        int n = (int) in.nval;
        in.nextToken();
        int k = (int) in.nval;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            in.nextToken();
            arr[i] = (int) in.nval;
        }
        int res = 0;
        int i = 0;
        while (i < arr.length && arr[i] > 0 && arr[i] >= arr[k - 1]) {
            i ++;
            res ++;
        }

        out.print(res);
        out.flush();
    }
}