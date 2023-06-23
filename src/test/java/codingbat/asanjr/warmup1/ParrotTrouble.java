package codingbat.asanjr.warmup1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        boolean a = false;
        if (talking && (hour < 7 || hour > 20)) {
            a = true;
        }return a;
    }

}
