package codingbat.syrgak.warmup1;

public class WarmUp2706 {
    public boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }
    public String endUp(String str) {
        if(str.length() < 3)
            return str.toUpperCase();

        return str.substring(0, str.length() - 3) +
                str.substring(str.length() - 3).toUpperCase();
    }
    public boolean stringE(String str) {
        int num = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e')
                num++;
        }
        return 1 <= num && num <= 3;

    }
    public String everyNth(String str, int n) {
        String temp = "";
        for (int i = 0; i < str.length();i = i + n)
            temp += str.charAt(i);
        return temp;
    }
}