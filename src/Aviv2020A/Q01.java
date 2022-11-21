package Aviv2020A;

import java.util.Scanner;

public class Q01 {
    public static void parOlNum() {
        Scanner in = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;
        int sumPazetevNum = 0;
        int numScannd = 0;
        int sumEqrelNum = 0;
        while (num1 / num2 != -1) {
            num1 = in.nextInt();
            num2 = in.nextInt();
            numScannd += 2;

            if(num1>0){
                sumPazetevNum +=num1;
            }
            if(num2>0){
                sumPazetevNum += num2;
            }
            if(num1 == num2){
                sumEqrelNum ++;
            }

        }
        System.out.println("numScannd" + numScannd);
        System.out.println("sumPazetevNum" + sumPazetevNum);
        System.out.println("sumEqrelNum" + sumEqrelNum);
    }
}
