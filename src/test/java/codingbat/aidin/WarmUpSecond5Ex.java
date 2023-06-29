package codingbat.aidin;

public class WarmUpSecond5Ex {
    public boolean makes10(int a, int b) {
        if (a + b == 10) return true;
        if (a == 10 || b == 10) return true;
        return false;
    }
    public boolean nearHundred(int n) {
        if (n > 89 && n < 111 || n > 189 && n < 211) return true;
        return false;
    }
    public boolean posNeg(int a, int b, boolean negative) {
        if (a < 0 && b < 0 && negative) return true;
        if (a < 0 && b > 0 || a > 0 && b < 0){
            if (!negative)
                return true;
        }
        return false;
    }
    public String notString(String str) {
        if (str.startsWith("not")) return str;
        else return "not " + str;
    }
    public String missingChar(String str, int n) {
        String ne = str.charAt(n) + "";
        return str.replace(ne, "");
    }
}
