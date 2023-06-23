package codingbat.Janyla;

public class monkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }
    public int diff21(int n) {
        int k=0;
        if(n<=21){
            k=21-n;
        }if(n>21){
            k=(n-21)*2;
        }return k;

    }

}
