package codingbat.Janyla;

public class Warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        boolean s= true;
        boolean d= false;
        if(a==10|| b==10){
            return s;
        }if ((a+b)==10){
            return s;
        }return d;

    }


    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
    public String notString(String str) {
        String b = " ";
        if (!str.contains("not")) {
            b ="not "+ str ;
            return b;
        }
        if (str.startsWith("not")) {
            b = str;
            return b;
        }if (str.contains("not")){
            b= "not "+ str ;
            return b;
        }return b;

    }
}
