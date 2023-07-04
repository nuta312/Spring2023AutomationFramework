package codingbat.syrgak.warmup1;

public class WarmUp2506 {
    //1
    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        String one1 = str.substring(0, 2);
        if (one1.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }//2
    public boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100) {
            return true;
        }
        return false;
    }//3
    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        } else {
            return false;
        }
    }//4
    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19)) {
            return true;
        } else {
            return false;
        }
    }//5
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        if (aTeen && !bTeen || !aTeen && bTeen){
            return true;
        }
        return false;
    }//6
    public String delDel(String str) {
        return (str.length()>1 && str.substring(1).
                startsWith("del"))? str.replace("del","") : str;

    }//7
    public boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");
    }//8
    public String startOz(String str) {
        String result = "";
        if(str.length() >= 1 && str.charAt(0) == 'o') {
            result += str.charAt(0);
        }if(str.length() >= 2 && str.charAt(1) == 'z') {
            result += str.charAt(1);
        }return result;
    }//9
    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }//10
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
}
