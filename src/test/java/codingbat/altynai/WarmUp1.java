package codingbat.altynai;

public class WarmUp1 {
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public String addNotToString(String str) {
        if (str.startsWith("not ")) {
            return str;
        } else {
            return "not " + str;
        }
    }
    public String missingChar(String str, int n) {
        String front=str.substring(0,n);
        String back=str.substring (n+1, str.length());
        return front +back;
    }
    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length()-1);
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
    public String front3(String str) {
        String front;
        if (str.length() >= 3){
            front = str.substring (0,3);

        }else {
            front =str;
        }
        return front+front+front;
    }
    public boolean or35(int n) {
        return (n % 3==0)||(n %  5==0);
    }
    public String front22(String str) {
        int cut =2;

        if (cut >str.length()){
            cut=str.length();

        }
        String front=str.substring(0,cut);
        return front+str+front;
    }
    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        String firstTwo = str.substring(0, 2);
        if (firstTwo.equals("hi")) {
            return true;

        } else {
            return false;
        }
    }
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) ||
                (b>=13 && b<=19) ||
                (c>=13 && c<=19);
    }
    public boolean loneTeen(int a, int b) {
        boolean at= (a>=13 && a<=19);
        boolean bt= (b<=19 && b>=13);
        return (at && !bt) || (!at &&bt);
    }
    public String delDel(String str) {
        if (str.length()>=4 && str.substring (1,4).equals("del")){
            return str.substring(0,1)+str.substring(4);
        }
        return str;
    }
    public boolean mixStart(String str) {
        return  str.startsWith("ix",1);

    }
    public String startOz(String str) {
        String result = "";
        if( str.startsWith ("o",0 )) {   result= "o";
        }
        if (str.startsWith ("z",1 )){   result ="z";
        }  if (str.startsWith ("oz",0 )){
            result ="oz";
        }return result;
    }
    public int intMax(int a, int b, int c) {
        int max;
        if (a>b){
            max =a;
        }else{
            max=b;
        }if (max<c){
            max=c;
        } return max;
    }
    public int close10(int a, int b) {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);

        if (diffA < diffB) {
            return a;
        } else if (diffB < diffA) {
            return b;
        } else {
            return 0;
        }
    }
    public boolean in3050(int a, int b) {
        if (a>=30 && a<=40 && b>=30 && b<=40) {
            return true;
        } if (a>=40 && a<=50 && b>=40 && b<=50) {
            return true;
        } else{
            return false;
        }
    }
    public int max1020(int a, int b) {
        if (b>a){
            int temp=a;
            a=b;
            b=temp;
        }

        if (a>=10 && a<=20) return a;
        if (b>=10 && b<=20) return b;
        return 0;
    }
    public boolean stringE(String str) {

        int count=0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt (i)=='e') count++;

        }
        return (count >=1 && count <=3);
    }
    public boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }


}



