package Sliver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

class Coordinate {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Baek_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(reader.readLine());
        
        Coordinate[] mat = new Coordinate[n];
        
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            mat[i] = new Coordinate(x, y);
        }
        
        Arrays.sort(mat, new Comparator<Coordinate>() {
            @Override
            public int compare(Coordinate a, Coordinate b) {
                if (a.y < b.y) {
                    return -1;
                } else if (a.y == b.y) {
                    if (a.x < b.x) {
                        return -1;
                    } else if (a.x == b.x) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    return 1;
                }
            }
        });
        
        for (int i = 0; i < n; i++) {
            writer.write(mat[i].x + " " + mat[i].y + "\n");
        }
        
        writer.flush();
    }
}

