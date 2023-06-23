package codingbat.asanjr.warmup1;

public class NearHunderd {
    public boolean nearHundred(int n) {
        boolean a = false;
        if ((n >= 90 && n <= 110) || (n >= 190 && n <= 210)){
            a = true;
        }
        return a;
    }
}
