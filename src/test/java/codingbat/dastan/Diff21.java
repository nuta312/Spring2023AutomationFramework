package codingbat.dastan;

public class Diff21 {
    public int diff21(int n) {
        int sum = Math.abs(21 - n);
        if (n > 21)
            return 2 * sum;
        else
            return sum;
    }

    public boolean monkeyTroubleMethod(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true) {
            return true;
        } else if (aSmile == false && bSmile == false) {
            return true;
        } else {
            return false;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (!talking)
            return false;
        else if (hour > 20 || hour < 7)
            return true;
        else
            return false;

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
    public int sumDoubleMethod(int a, int b) {
        if(a == b){
            return (a + b) * 2;
        }else{
            return a + b;
        }
    }


}
