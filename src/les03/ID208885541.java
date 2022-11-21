package les03;

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
//       ID208885541.testStr();
        ID208885541.opesetNum();
    }
}

public class ID208885541 {
    public static void opesetNum() {
        Scanner in = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;
        int sumPazetevNum = 0;
        int numScannd = 0;
        int sumEqrelNum = 0;
        while ((float)num1 / num2 != -1) {
            num1 = in.nextInt();
            num2 = in.nextInt();
            numScannd += 2;

            if (num1 > 0) {
                sumPazetevNum += num1;
            }
            if (num2 > 0) {
                sumPazetevNum += num2;
            }
            if (num1 == num2) {
                sumEqrelNum++;
            }

        }
        System.out.println("numScannd" + numScannd);
        System.out.println("sumPazetevNum" + sumPazetevNum);
        System.out.println("sumEqrelNum" + sumEqrelNum);
    }

    public static boolean triangularArr(int[] arr) {
        int lenSecsen = arr.length / 3;
        for (int i = 0; i < arr.length - lenSecsen; i++) {
            if (arr[i] != arr[i + lenSecsen]) {
                return false;
            }
        }
        return true;
    }

    public static void testStr() {
        int cont = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            String a = in.next();
            char fost = a.charAt(0);
            char lest = a.charAt((a.length()) - 1);
            if (fost=='x' && lest=='x') {
                cont++;
            }else if (fost=='z'|| lest=='z') {
                break;
            }
        }
        System.out.println(cont);
    }

    public static boolean isPeak(int[] arr, int index) {
        if (index == 0 || index == arr.length) {
            return false;
        }
        if (arr[index] < arr[index - 1] || arr[index] < arr[index + 1]) {
            return false;
        }
        return true;
    }

    public static int numPeak(int[] arr) {
        int cont = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (isPeak(arr, i)){
                cont++;
            }

        }
        return cont;
    }
}

























