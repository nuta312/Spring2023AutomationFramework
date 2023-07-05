package codingbat.manasik;

public class WarmupJune30 {

    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50)) {
            return true;
        } else {
            return false;
        }
    }


    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }


    public boolean stringE(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e')
                count++;
        }
        return (count >= 1 && count <=3);
    }


    public boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }


    public String endUp(String str) {
        if(str.length() < 3){
            return str.toUpperCase();
        }else{
            StringBuilder new1 = new StringBuilder();
            new1.append(str.substring(0,str.length() - 3));
            new1.append(str.substring(str.length() - 3).toUpperCase());
            return new1.toString();
        }

    }


    public String everyNth(String str, int n) {
        if (str.length() <= 1 || n >= str.length()) {
            return str.substring(0, 1);
        }
        return str.charAt(0) + everyNth(str.substring(n), n);
    }

//WARMUP2

    public String stringTimes(String str, int n) {
        String result = "";
        for(int i = 0; i < n; i++){
            result += str;
        }
        return result;
    }


    public String frontTimes(String str, int n) {
        String str1 = "";
        if(str.length() < 3){
            for(int i =0; i < n; i++){
                str1 += str;
            }
            return str1;
        }

        String front = str.substring(0, 3);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }


    int countXX(String str) {
        int xx = 0;
        for(int i =0; i<str.length()-1; i++){
            if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
                xx++;
            }
        }
        return xx;
    }


    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;
        String x = str.substring(i);
        return x.startsWith("xx");

    }
}
