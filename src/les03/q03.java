package les03;

public class q03 {
    public static boolean muzn(int[] arr){
        int size = arr.length;
        if (size<3 || size%2==0){
            return false;
        }
        int madilNum = size/2;
        int i =0;
        for (; size/2>i; i++){
            if (arr[madilNum]>=arr[i]){
                return false;
            }
        }
        i++;
        for (;size>i;i++){
            if (arr[madilNum]<=arr[i]){
                return false;
            }
        }
        return true;
    }
}
