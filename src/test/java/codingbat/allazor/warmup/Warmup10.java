package codingbat.allazor.warmup;

public class Warmup10 {

    public boolean makes10(int a, int b) {
        if (a == 10 || (a + b) == 10 || b == 10) {
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10 ||
                (Math.abs(200 - n) <= 10)));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public String notString(String str) {
        if (!str.startsWith("not")) {
            return "not " + str;
        }
        return str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public String frontBack(String str) {
        if (str.length() > 1) {
            String word = str.substring(1, str.length() - 1);
            return str.charAt(str.length() - 1) + word + str.charAt(0);
        } else {
            return str;
        }
    }

    public String front3(String str) {
        if(str.length()>= 3){
            String str1 = str.substring(0,3);
            return str1+str1+str1;
        } return str+str+str;
    }

    public String backAround(String str) {
        int n= str.length()-1;
        char ch= str.charAt(n);
        return ch+str+ch;
    }

    public boolean or35(int n) {
        return (n%3 == 0 || n%5==0);
    }

    public String front22(String str) {
        if (str.length()>=2){
            String front = str.substring(0,2);
            return front + str + front;
        } return str+str+str;
    }
}
