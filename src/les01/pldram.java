package les01;

public class pldram {
    public static boolean in(int num, int[] arr) {
        for(int i :arr){
            if(i==num){
                return true;
            }
        }
        return false;
    }
}
