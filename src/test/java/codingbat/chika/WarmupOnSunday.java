package codingbat.chika;

public class WarmupOnSunday {
    public boolean startHi(String str) {
        return (str.startsWith("hi"))?true:false;
    }
    public boolean icyHot(int temp1, int temp2) {
        return (temp1<0&&temp2>100||temp1>100&&temp2<0)?true:false;
    }
    public boolean in1020(int a, int b) {
        return (a>=10&&a<=20||b>=10&&b<=20)?true:false;
    }
    public boolean hasTeen(int a, int b, int c) {
        return (a>=13&&a<=19||b>=13&&b<=19||c>=13&&c<=19)?true:false;
    }
    public boolean loneTeen(int a, int b) {
        return (a>=13&&a<=19&&b>=13&&b<=19||a==b)?false:true;
    }
    public String delDel(String str) {
        return (str.length()>1&&str.substring(1).startsWith("del"))?str.replace("del",""):str;
    }
    public boolean mixStart(String str) {
        return (str.length()>1&&str.substring(1).startsWith("ix"))?true:false;
    }
    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }
        return result;
    }
    public int intMax(int a, int b, int c) {
        return Integer.max(Integer.max(a,b),c);
    }
    public int close10(int a, int b) {
        int num = 0;
        if (b==10&&a==10){
            return num ;}
        else if (a<=10&&a>=8){
            return a ;
        }else  if (b<=10&&b>=8){
            return b ;
        }else  if (a==5){
            return a ;}
        return num ;
    }
}
