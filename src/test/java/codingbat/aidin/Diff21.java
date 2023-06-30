package codingbat.aidin;

public class Diff21 {
    public int diff21(int n) {
        if (n <= 21){
            return 21 - n;
        }else {
            return (n - 21) * 2;
        }
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true){
            return true;
        }else if (aSmile == false && bSmile == false){
            return true;
        }return false;
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour<7||hour>20));
    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true){
            return true;
        }
        return false;
    }
    public int sumDouble(int a, int b) {
        if (a != b){
            return a + b;
        }else if (a == b){
            int sum = a + b;
            sum = sum + sum;
            return sum;
        }return 1;
    }
}
