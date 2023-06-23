package codingbat.aidin;

public class parrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour<7||hour>20));
    }
}
