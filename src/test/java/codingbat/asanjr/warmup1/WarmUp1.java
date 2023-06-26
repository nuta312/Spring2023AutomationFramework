package codingbat.asanjr.warmup1;

public class WarmUp1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation == true){
            return true;
        }else if (weekday == false){
            return true;
        }else return false;
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour > 20||hour<7)){
            return true;

        }  return false;

    }

}
