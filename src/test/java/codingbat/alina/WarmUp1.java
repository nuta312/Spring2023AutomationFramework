package codingbat.alina;

public class WarmUp1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }
    public boolean makes10(int a, int b) {
        if(a==10||b==10||a+b==10){
            return true;
        }
        else {
            return false;
        }

    }
    public boolean posNeg(int a, int b, boolean negative) {
        if(negative){
            return a<0&&b<0;
        }
        else {
            return (a<0&&b>0)||(a>0&&b<0);
        }
    }
}