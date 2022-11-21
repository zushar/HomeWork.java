import les01.*;
import Aviv2020A.*;

import java.util.Arrays;
import java.util.Scanner;

import les02.q04;
import les03.q03;

public class Main {
    // public static int goo(int x[], int s) {
    // if (s == 1)
    // return x[s-1];
    // return goo(x, s-1) + x[0];
    // }
    public static void main(String[] args) {
        int[] arr = { 50, 56, 123, 12, 10, -4, 2 };
        // System.out.println(HomeWork.pufect(arr));
        // System.out.println(pldram.in(13, arr));
        // Q01.parOlNum();
        // System.out.println(Arrays.toString(Q02.randomNum(18)));
        // int z = q04.arrUpDon(arr);

        System.out.println(q03.muzn(arr));
        Scanner in = new Scanner(System.in);
        int num = 1;
        int numScand = 0;
        int positivNum = 0;
        int zuge = 0;

        while (num != 0) {
            num = in.nextInt();
            numScand++;
            if (num % 2 == 0 && num != 0) {
                zuge++;
            }
            if (num > 0) {
                positivNum++;
            }
        }
        double avrigPositiv = (double) numScand / positivNum;
        System.out.println("numScand:" + numScand);
        System.out.println("zuge:" + zuge);
        System.out.println("avrigPositiv:" + avrigPositiv);
    }
}