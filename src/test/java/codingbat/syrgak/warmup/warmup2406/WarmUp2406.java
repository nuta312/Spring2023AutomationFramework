package codingbat.syrgak.warmup.warmup2406;

public class WarmUp2406 {
    //1
    public class Makes10 {
        public boolean makes10(int a, int b) {
            return a == 10 || b == 10 || a + b == 10;
        }
    }//2
    public boolean nearHundred(int n) {
        return ((Math.abs(100-n) <= 10) || (Math.abs(200 -n) <= 10));
    }//3
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative){
            return (a<0 && b<0);
        }else{
            return ((a<0 && b>0 || a>0 && b<0));
        }
        //4
    }public String notString(String str) {
        if(str.length() >= 3 && str.substring(0, 3).equals("not"))
            return str;
        return "not " + str;
    }//5
    public String missingChar(String str, int n) {
        String front = str.substring(0,n);
        String back = str.substring (n+1);
        return front + back;
    }//6
    public String frontBack(String str) {
        if (str.length() <= 1){
            return str;
        }else{
            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);

            return last + str.substring (1,str.length()-1) + first;
        }
    }//7
    public String front3(String str) {
        String aya;
        if(str.length() >= 3){
            aya=str.substring(0,3);
        }
        else{
            aya = str;
        }
        return aya + aya + aya;
    }//8
    public String backAround(String str) {
        String last = str.substring(str.length()-1);
        return last +str+ last;
    }//9
    public boolean or35(int n) {
        if(n%3 == 0 || n%5 == 0){
            return true;
        }
        return false;
    }//10
    public String front22(String str) {
        String front;
        if(str.length() < 2)
            front = str;
        else
            front = str.substring(0, 2);

        return front + str + front;
    }



}
