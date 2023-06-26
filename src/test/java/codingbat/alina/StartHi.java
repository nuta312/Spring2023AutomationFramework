package codingbat.alina;

public class StartHi {
    public boolean startHi(String str) {
        if(str.startsWith("hi")){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean icyHot(int temp1, int temp2) {
        if(temp1>0&&temp2<100||temp1<0&&temp2>100){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean in1020(int a, int b) {
        if(a>=10&&a<=20||b>=10&&b<=20){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean hasTeen(int a, int b, int c) {
        if(a>=13&&a<=19||b>=13&&b<=19||c>=13&&c<=19){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b < 13 || b > 19)) {
            return true;
        } else if ((b >= 13 && b <= 19) && (a < 13 || a > 19)) {
            return true;
        } else {
            return false;
        }
    }
}
