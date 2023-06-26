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

    public boolean sameStarChar(String str) {


        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }


}
