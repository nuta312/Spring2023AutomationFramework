package codingbat.allazor.warmup;

public class Warmup10 {

    public boolean makes10(int a, int b) {
        if (a == 10 || (a+b)==10 || b == 10){
            return true;
        }return false;
    }

    public boolean nearHundred(int n) {
        return  (( Math.abs(100-n) <=10 ||
                ( Math.abs(200-n) <=10)));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public String notString(String str) {
        if (!str.startsWith("not")){
            return "not " + str;
        } return str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0,n)+str.substring(n+1);
    }

}
