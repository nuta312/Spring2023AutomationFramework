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

}


