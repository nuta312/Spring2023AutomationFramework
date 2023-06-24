package codingbat.chika;

public class Warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday ||vacation ;
    }
    public int diff21(int n) {
        return (n<21)?21-n:(n-21)*2;
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile &&bSmile||!aSmile &&!bSmile;
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking&&(hour<7||hour>20)?true:false;
    }
    public int sumDouble(int a, int b) {
        return (a==b)?(a+b)*2:a+b;
    }
}
