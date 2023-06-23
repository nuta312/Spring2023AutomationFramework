package codingbat.asanjr.warmup1;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation == true){
            return true;
        }else if (weekday == false){
            return true;
        }else return false;
    }


}
