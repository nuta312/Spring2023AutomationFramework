package codingbat.aygerim;

public class WarmUp1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        } return false;

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile){ //
            return true;
        } //
        if (!aSmile && !bSmile){
            return true;
        }
        return false;
    }

// true true  true

    public int sumDouble(int a, int b) {
        int sum = a+b;
        if (a==b){
            sum = sum*2;
        }
        return sum;
    }

    public int diff21(int n) {
        if (n<=21){
            return 21 - n;
        } else {
            return (n-21)*2;
        }
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour > 20||hour<7)){
            return true;
        }  return false;
    }
}
