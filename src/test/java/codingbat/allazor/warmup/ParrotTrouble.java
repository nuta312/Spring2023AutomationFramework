package codingbat.allazor.warmup;

public class ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour > 0 && hour < 7){
            return talking;
        }
        if (hour > 20 && hour <=23){
            return talking;
        } else return false;
    }
}
