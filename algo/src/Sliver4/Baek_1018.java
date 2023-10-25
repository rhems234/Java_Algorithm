package Sliver4;

import java.util.Scanner;

public class Baek_1018 {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        scan.nextLine(); 
        
        String[] mat = new String[n];
        for (int i = 0; i < n; i++) {
            mat[i] = scan.nextLine();
        }
        
        int min = n * m;
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                double cnt1 = 0;
                double cnt2 = 0;
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if ((k + l) % 2 == 0) {
                            if (mat[k].charAt(l) == 'B') {
                                cnt1++;
                            } else {
                                cnt2++;
                            }
                        } else {
                            if (mat[k].charAt(l) == 'B') {
                                cnt2++;
                            } else {
                                cnt1++;
                            }
                        }
                    }
                }
                min = (int) Math.min(min, Math.min(cnt1, cnt2));
            }
        }
        
        System.out.println(min);
    }
}
