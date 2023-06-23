package codingbat.allazor.warmup;

public class Warmup1_5 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
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
        if (a==b){
            return (a+b)*2;
        } return a+b;
    }

    public int diff21(int n) {
        if (n<=21){
            return 21-n;
        } return (n-21)*2;
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour > 0 && hour < 7){
            return talking;
        }
        if (hour > 20 && hour <=23){
            return talking;
        } else return false;
    }
}
