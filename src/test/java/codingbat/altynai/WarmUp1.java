package codingbat.altynai;

public class WarmUp1 {
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

    public String addNotToString(String str) {
        if (str.startsWith("not ")) {
            return str;
        } else {
            return "not " + str;
        }
    }
    public String missingChar(String str, int n) {
        String front=str.substring(0,n);
        String back=str.substring (n+1, str.length());
        return front +back;
    }
    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length()-1);
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
    public String front3(String str) {
        String front;
        if (str.length() >= 3){
            front = str.substring (0,3);

        }else {
            front =str;
        }
        return front+front+front;
    }
    public boolean or35(int n) {
        return (n % 3==0)||(n %  5==0);
    }
    public String front22(String str) {
        int cut =2;

        if (cut >str.length()){
            cut=str.length();

        }
        String front=str.substring(0,cut);
        return front+str+front;
    }
    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        String firstTwo = str.substring(0, 2);
        if (firstTwo.equals("hi")) {
            return true;

        } else {
            return false;
        }
    }
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

}


