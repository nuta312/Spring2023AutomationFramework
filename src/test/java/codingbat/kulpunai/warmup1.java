package codingbat.kulpunai;

public class warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }   return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == bSmile){
            return true;
        }   return false;
    }
    public int sumDouble(int a, int b) {
        if(a!=b){
            return (a+b);
        }   return (2*(a+b));
    }
    public int diff21(int n) {
        if(n<=21){
            return Math.abs(n-21);
        } else{
            return (2*Math.abs(n-21));
        }
    }
    public boolean parrotTrouble(boolean talking, int hour){

        return (talking && (hour >= 1 && hour < 7 || hour <= 23 && hour > 20));

    }
    //6
    public boolean makes10(int a, int b) {

        if(a == 10 || b ==10 || (a + b == 10)){
            return true;
        }else {
            return false;
        }
    }
    //7
    public boolean nearHundred(int n) {
        if((n >= 90 && n <= 100) || (n >= 100 && n <= 110 ) ||( n >= 190 && n <= 200) ||(n >= 200 && n <= 210)){
            return true;
        } else{
            return false;
        }
    }
    //8
    public boolean posNeg(int a, int b, boolean negative) {
        if ((((a > 0) && (b < 0)) && (negative == false)) || (((a < 0) && (b > 0) && (negative == false))) ||
                ((a < 0) && (b < 0)) && (negative == true)) {
            return true;
        } else {
            return false;

        }
    }
    //9
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }else{
            return "not " + str;

        }
    }
    //10
    public String missingChar(String str, int n) {

        StringBuilder stra = new StringBuilder();
        str.equals(stra.deleteCharAt(n).toString());
        return str;
    }

}
