package codingbat.tilek;

public class String2 {


    public String repeatEnd(String str, int n) {

        String aLast = str.substring(str.length()-n);
        String result = "";
        for (int i = 0; i < n; i++){
            result += aLast;
        }
        return result;
    }

}
