package codingbat.chika;

public class WarmupParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking&&(hour<7||hour>20)?true:false;
    }

}
