package Bronze3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_24264 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long cnt = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(cnt*cnt));
        bw.newLine();
        bw.write(String.valueOf(2));
        bw.flush();
        bw.close();
    }
}
