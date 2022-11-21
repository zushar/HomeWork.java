package les01;

public class HomeWork {
    public static boolean pufect(int[] arr) {
        int i = 0;
        if(arr.length%2==0){
            return false;
        }
        for (; i < arr.length/2; i++){
            if(arr[i]<0 || arr[i]>9){
                return false;
            }
        }

         if(arr[i]!=0){
            return false;
        }
         i++;
        for (; i < arr.length; i++){
            if(arr[i]<10){
                return false;
            }
        }
        return true;
    }
}
