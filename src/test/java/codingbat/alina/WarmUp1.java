package codingbat.alina;

public class WarmUp1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;

    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile){
            return true;
        }
        if(!aSmile && ! bSmile){
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if(a==b){
            return 2*(a+b);
        }
        else{
            return a+b;
        }
    }
}