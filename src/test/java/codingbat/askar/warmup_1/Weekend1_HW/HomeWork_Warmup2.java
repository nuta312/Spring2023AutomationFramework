package codingbat.askar.warmup_1.Weekend1_HW;

public class HomeWork_Warmup2 {
    //(1) Warmup-1 > makes10
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10);
    }

    //(2) Warmup-1 > nearHundred
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    // (3) Warmup-1 > posNeg
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    //(4) Warmup-1 > notString
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;
    }

    //(5) Warmup-1 > missingChar
    public String missingChar(String str, int n) {
        String front = str.substring(0,n);
        String back = str.substring(n+1, str.length());

        return front + back;
    }

    //(6) Warmup-1 > frontBack
    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        String middle = str.substring(1, str.length() - 1);

        return lastChar + middle + firstChar;
    }

    //(7) Warmup-1 > front3
    public String front3(String str) {
    String front;
    if (str.length() >= 3){
        front = str.substring(0,3);
    }else{
        front = str;
    }
    return front + front + front;
    }

    //(7) Warmup-1 > backAround
    public String backAround(String str) {
        String last = str.substring(str.length() -1);
        return last + str + last;
    }

    //(8) Warmup-1 > or35
    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 ==0);
    }

    //(9) Warmup-1 > front22
    public String front22(String str) {
        int take = 2;
        if (take > str.length()){
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }

    //(10) Warmup-1 > startHi
    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        String firstTwoChars = str.substring(0, 2);
        return firstTwoChars.equals("hi");
    }
}
