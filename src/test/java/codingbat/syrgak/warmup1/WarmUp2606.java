package codingbat.syrgak.warmup1;

public class WarmUp2606 {
    public int intMax(int a, int b, int c) {
        if(a > b && a > c)
            return a;
        else if(b > c)
            return b;
        else return c;
    }
    public int close10(int a, int b) {
        int aDiff = Math.abs(a-10);
        int bDiff = Math.abs(b-10);
        if(aDiff < bDiff){
            return a;
        }
        if(aDiff > bDiff){
            return b;
        }
        return 0;
    }
    public boolean in3050(int a, int b) {

        if (a>=30 && a<=40 && b>=30 && b<=40){
            return true;
        }
        if (a>=40 && a<=50 && b>=40 && b<=50){
            return true;
        }
        return false;
    }
    public int max1020(int a, int b) {
        if(b > a) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        if(10 <= a && a <= 20)
            return a;

        if(10 <= b && b <= 20)
            return b;

        return 0;

    }
    public boolean stringE(String str) {
        int num = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e')
                num++;
        }
        return 1 <= num && num <= 3;

    }


}
