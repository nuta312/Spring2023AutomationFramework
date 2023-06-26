package codingbat.ismailov;

public class CodBat_16_25 {
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }

    }
    public boolean in1020(int a, int b) {
        if(( a >= 10 && a <= 20) || (b >= 10 && b <= 20))
            return true;
        else
            return false;
    }

    public boolean hasTeen(int a, int b, int c) {
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || ( c >= 13 && c<= 19)){
            return true;
        }else{
            return false;
        }

    }
    public boolean loneTeen(int a, int b) {
        if((a >= 13 && a <= 19) && (b < 13 || b > 19)){
            return true;
        }else if((b >= 13 && b <= 19) && (a < 13 || a > 19)){
            return true;
        }else{
            return false;
        }
    }
    public String delDel(String str) {
        if (str.startsWith("del", 1)){
            return str.charAt(0) + str.substring(4, str.length());
        }else{
            return str;
        }
    }
    public boolean mixStart(String str) {
        if(str.startsWith("ix", 1)){
            return true;
        }else{
            return false;
        }
    }
    public String startOz(String str) {
        if(str.startsWith("o",0) && (str.startsWith("z", 1))){
            return "oz";
        }else if(str.startsWith("o",0)){
            return "o";
        }else if(str.startsWith("z",1)){
            return "z";
        }else{
            return "";
        }
    }
    public int intMax(int a, int b, int c) {
        int max = a;
        if ( b > max) max = b;
        if ( c >max) max = c;
        return max;
    }
    public int close10(int a, int b) {
        int num1 = Math.abs(a - 10);
        int num2 = Math.abs(b - 10);
        if(num1 == num2){
            return 0;
        }
        if(num1 > num2){
            return b;
        }else{
            return a;
        }

    }


}
