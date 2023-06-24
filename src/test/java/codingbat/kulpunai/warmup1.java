package codingbat.kulpunai;

public class warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }   return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == bSmile){
            return true;
        }   return false;
    }
    public int sumDouble(int a, int b) {
        if(a!=b){
            return (a+b);
        }   return (2*(a+b));
    }
    public int diff21(int n) {
        if(n<=21){
            return Math.abs(n-21);
        } else{
            return (2*Math.abs(n-21));
        }
    }
    public boolean parrotTrouble(boolean talking, int hour){

        return (talking && (hour >= 1 && hour < 7 || hour <= 23 && hour > 20));

    }

}
