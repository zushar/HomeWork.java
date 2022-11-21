package Aviv2020A;
import java.util.Random;
public class Q02 {
    public static int[]randomNum(int num){
        Random rand = new Random();
        int[] arr = new int[num];
      for(int i = 0; i<arr.length; i++){
          arr[i] = rand.nextInt(8) + 12;
      }
    return arr;
    }
}
