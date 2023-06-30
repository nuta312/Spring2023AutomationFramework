package codingbat.allazor.warmup;

public class Warmup25 {

    public boolean startHi(String str) {
        if (str.startsWith("hi")){
            return true;
        } return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        if (temp1<0){
            if (temp2>100){
                return true;
            }
        } else if (temp1>100 && temp2<0){
            return true;
        }
        return false;
    }

    public boolean in1020(int a, int b) {
        if ((a>=10 && a<=20)||(b>=10 && b<=20)){
            return true;
        }return false;
    }

    public boolean hasTeen(int a, int b, int c) {
        for (int i=13; i<=19; i++){
            if(a==i || b==i ||c==i) {
                return true;
            }
        } return false;
    }

    public boolean loneTeen(int a, int b) {
        if (a>=13 && a<=19) {
            if (!(b>=13 && b<=19)){
                return true;
            }
        } else if (b>=13 && b<=19) {
            return true;
        } return false;
    }
    public String delDel(String str) {
        if(str.length()>=4) {
            String str1 = str.substring(1);
            if (str1.startsWith("del")) {
                return str.charAt(0) + str.substring(4);
            }
        } return str;
    }

    public boolean mixStart(String str) {
        if (str.length()>=3 && str.substring(1,3).equals("ix")){
            return true;
        }return false;
    }

    public String startOz(String str) {
        String str1 = "";
        if (str.length()>=1 && str.charAt(0)=='o'){
            str1="o";
        }
        if (str.length() >= 2 && str.charAt(1)=='z'){
            str1= str1+"z";
        }
        return str1;
    }

    public int intMax(int a, int b, int c) {
        if (a>b){
            if (a>c){
                return a;
            }
        } if (b>a){
            if (b>c){
                return b;
            }
        } return c;
    }

    public int close10(int a, int b) {
        int a1= Math.abs(a-10);
        int b1=Math.abs(b-10);
        if(a1>b1){
            return b;
        }  if(a1==b1){
            return 0;
        } return a;
    }

}