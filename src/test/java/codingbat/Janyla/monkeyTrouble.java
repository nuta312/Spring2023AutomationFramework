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
    public String backAround(String str) {
        char s=str.charAt(str.length()-1);
        String b= s+ str +s;
        return b;
    }

    public boolean or35(int n) {
        if (n%3==0 || n%5==0){
            return true;
        }return false;
    }

    public String front22(String str) {
        String result="";
        if(str.length()>=2){
            String j=str.substring(0,2);
            result= j+str+j;
        }
        if(str.length()==1){
            String b=str.substring(0,1);
            result= b+str+b;
        }return result;
    }


}
