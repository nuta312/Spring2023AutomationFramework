package codingbat.asanjr.warmup1;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true){
            return true;
        }else if (aSmile == false && bSmile == false){
            return true;

        }
        else {
            return false;

        }
    }
}
