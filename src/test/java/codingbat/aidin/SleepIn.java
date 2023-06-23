package codingbat.aidin;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true){
            return true;
        }
        return false;
    }
}
