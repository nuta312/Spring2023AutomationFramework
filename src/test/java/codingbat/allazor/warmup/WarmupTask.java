package codingbat.allazor.warmup;

public class WarmupTask {

    public boolean in3050(int a, int b) {
        if ((a>=30 && a<=40) && (b>=30 && b<=40)){
            return true;
        } else if ((a>=40 && a<=50)&&(b>=40 && b<=50)){
            return true;
        } return false;
    }

    public int max1020(int a, int b) {
        if (b > a) {
            int min = a;
            a = b;
            b = min;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    public boolean stringE(String str) {
        int count=0;
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)=='e'){
                count++;
            }
        } return (count>=1 && count<=3);
    }

    public boolean lastDigit(int a, int b) {
        int aa=a%10;
        int bb=b%10;
        if (aa==bb){
            return true;
        } return false;

    }
    public String endUp(String str) {
        if (str.length()>=4){
            String end = str.substring(str.length()-3).toUpperCase();
            String beg = str.substring(0,str.length()-3);
            return beg+end;
        }return str.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String s ="";
        for (int i=0; i<str.length();i+=n){
            s = s+str.charAt(i);
        }
        return s;
    }
}
