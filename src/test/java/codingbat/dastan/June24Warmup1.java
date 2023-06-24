package codingbat.dastan;

public class June24Warmup1 {

    public boolean makes10(int a, int b) {
        if (a + b == 10 || a == 10 || b == 10) {
            return true;
        } else {
            return false;
        }
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


    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;

        } else {
            return "not " + str;
        }
    }


    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);

        return front + back;
    }


    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length() - 1);

        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }


    public String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }
        return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }


    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }


    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);

    }

    public String front22(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }
        String first = str.substring(0, 2);
        return first + str + first;
    }


}

