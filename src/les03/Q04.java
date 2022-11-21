package les03;

public class Q04 {
    public static boolean arrangedArr(int[] arr) {
        if (arr.length < 4) {
            return false;
        }
        if (arr.length % 2 != 0) {
            return false;
        }
        int sumFust = 0;
        int sumScond = 0;
        int i = 0;
        for (; arr.length/2 < i; i++) {
            sumFust += arr[i];
        }
        for (; arr.length < i; i++){
            sumScond += arr[i];
        }
        if (sumFust != sumScond) {
            return false;
        }
        return true;
    }
}
