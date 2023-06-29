
package codingbat.Nariman;

public class SecondcodigHW {
    public static void main(String[] args) {

    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10)
            return true;
        if (a + b == 10)
            return true;
        return false;
    }
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> origin/master
>>>>>>> origin/master
        public String notString(String str) {
            if(str.length()>=3&& str.substring(0,3).equals("not")){
                return str;
            }else{return "not "+str;}
        }

        public String missingChar(String str, int n) {
            String front = str.substring(0,n);
            String back = str.substring(n+1, str.length());
            return front+back;}

    }

