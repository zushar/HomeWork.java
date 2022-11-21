package les02;

public class q04 {
    public static int arrUpDon(int[] arr){
        int i = 0;
        int pesga = 1;
        int j = 1;
        int k = 2;
        while (arr[i]<arr[pesga]){
            i++;
            pesga++;
            j++;
            k++;

        }
        if(pesga == arr.length||pesga<2){
            return -1;
        }
        while (arr[j] > arr[k]) {
            j++;
            k++;
            if (arr[j] < arr[k]){
                return -1;
            }

        }
        return pesga;
    }
}
