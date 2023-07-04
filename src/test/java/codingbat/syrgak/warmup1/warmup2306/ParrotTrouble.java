package codingbat.syrgak.warmup1.warmup2306;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking && (hour < 7 || hour > 20)){
            return true;
        }
        return false;
    }
}
