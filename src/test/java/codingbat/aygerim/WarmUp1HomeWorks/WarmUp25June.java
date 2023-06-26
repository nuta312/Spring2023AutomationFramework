package codingbat.aygerim.WarmUp1HomeWorks;

public class WarmUp25June {
    public String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4, str.length());
        }
        return str;
    }
    public boolean mixStart(String str) {
        if (str.length()>=3 && (str.substring (1,3).equals("ix"))){
            return true;
        } return false;
    }
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }
    public int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }
    public boolean in3050(int a, int b) {
        if (((a>=30 && a<=40) && (b>=30 && b<=40)) || ((a>=40 && a<=50) && (b>=40 && b<=50))){
            return true;
        } return false;
    }
    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    } public boolean stringE(String str) {
        int count = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }
        return (count >= 1 && count <= 3);
    }
    public boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }
    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);  // this takes from cut to the end

        return front + back.toUpperCase();
    }

}
