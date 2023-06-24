package codingbat.ismailov;

public class CodBat_1_5 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false) {
            return false;
        } else {
            return true;
        }
    }

    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            return 2 * (a + b);
        } else
            return sum;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }
    public int diff21(int n) {
        int sum = Math.abs(21 - n);
        if (n > 21)
            return 2 * sum;
        else
            return sum;
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if(!talking)
            return false;
        else if(hour > 20 || hour < 7)
            return true;
        else
            return false;

    }
}
