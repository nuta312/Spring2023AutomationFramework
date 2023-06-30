package codingbat.kulpunai;

public class warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }   return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == bSmile){
            return true;
        }   return false;
    }
    public int sumDouble(int a, int b) {
        if(a!=b){
            return (a+b);
        }   return (2*(a+b));
    }
    public int diff21(int n) {
        if(n<=21){
            return Math.abs(n-21);
        } else{
            return (2*Math.abs(n-21));
        }
    }
    public boolean parrotTrouble(boolean talking, int hour){

        return (talking && (hour >= 1 && hour < 7 || hour <= 23 && hour > 20));

    }
    //6
    public boolean makes10(int a, int b) {

        if(a == 10 || b ==10 || (a + b == 10)){
            return true;
        }else {
            return false;
        }
    }
    //7
    public boolean nearHundred(int n) {
        if((n >= 90 && n <= 100) || (n >= 100 && n <= 110 ) ||( n >= 190 && n <= 200) ||(n >= 200 && n <= 210)){
            return true;
        } else{
            return false;
        }
    }
    //8
    public boolean posNeg(int a, int b, boolean negative) {
        if ((((a > 0) && (b < 0)) && (negative == false)) || (((a < 0) && (b > 0) && (negative == false))) ||
                ((a < 0) && (b < 0)) && (negative == true)) {
            return true;
        } else {
            return false;

        }
    }
    //9
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }else{
            return "not " + str;

        }
    }
    //10
    public String missingChar(String str, int n) {

        StringBuilder stra = new StringBuilder();
        str.equals(stra.deleteCharAt(n).toString());
        return str;
    }
    //11
    public String frontBack(String str) {
        char first = str.charAt(0);
        char second = str.charAt(str.length()-1);
        String v = str.replace(first, second);
        return v.replace(second, first);
    }
    //12
    public String front3(String str) {
        String front;
        if(str.length() >= 3){
            front = str.substring(0,3);
        }else {
            front=str;
        }

        return front+front+front;
    }
    //13
    public String backAround(String str) {
        String back = str.substring(str.length()-1);
        return back+str+back;
    }
    //14
    public boolean or35(int n) {

        if(n > 0 && (n%3==0 || n%5==0)){
            return true;
        } else{
            return false;
        }
    }
    //15
    public String front22(String str) {

        int index = 2;

        if(str.length() < index){
            index = str.length();
        }
        String front = str.substring(0, index);
        return front+str+front;
    }
    //16
    public boolean startHi(String str) {
        if(str.length() >= 2 && str.substring(0,2).equals("hi")){
            return true;}
        else{ return false;
        }
    }
    //17
    public boolean in1020(int a, int b) {
        if((a>=10 && a<=20) || (b>=10 && b <=20)){
            return true;
        }else {return false;}

    }
    //18
    public boolean hasTeen(int a, int b, int c) {
        if(((a >=13 && a <=19) || (b>=13 && b<=19) || (c>=13 && c<=19))
                ||((a >=13 && a <=19) && (b>=13 && b<=19) || (c>=13 && c<=19)) ||
                ((a >=13 && a <=19) || (b>=13 && b<=19) && (c>=13 && c<=19))){
            return true;
        }else{ return false;}
    }
    //19
    public boolean loneTeen(int a, int b) {
        boolean A = (a>=13 && a <=19);
        boolean B = (b>=13 && b<=19);
        return (A && !B) || (!A && B);
    }
    //20
    public String delDel(String str) {
        if( str.length() > 3 && str.substring(1,4).equals("del")){
            return str.substring(0,1) + str.substring(4);
        }
        return str;

    }


}
