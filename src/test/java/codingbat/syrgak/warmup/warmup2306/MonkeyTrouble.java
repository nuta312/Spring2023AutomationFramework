package codingbat.syrgak.warmup.warmup2306;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile){
            return true;
        } if(!aSmile && !bSmile){
            return true;
        }return false;
    }
}
