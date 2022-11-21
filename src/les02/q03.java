package les02;

public class q03{
    public static void subString(char a,String s){
        for (int i=0; i < s.length(); i++){
            if(s.charAt(i)==a){
                for (int j = i; j<s.length();j++){
                    System.out.println(s.charAt(i));
                }
            }
        }
    }
        }
