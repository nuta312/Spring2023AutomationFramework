package codingbat.syrgak.warmup;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else
        {
            return false;
        }
    }
}
