package codingbat.alina;

public class Task10 {
    public String delDel(String str) {
        if(str.length()==0){
            return "";
        }
        else  if(str.substring(1).startsWith("del")) {
            StringBuilder sb = new StringBuilder(str);
            sb.delete(1, 4);
            return sb.toString();
        }
        else {
            return str;
        }
    }
    public boolean mixStart(String str) {
        if(str.length()<3){
            return false;
        }
        else if(str.charAt(0)!='m'&&str.substring(1,3).equals("ix")||str.charAt(0)=='m'){
            return true;
        }
        else{
            return false;
        }
    }

    public String startOz(String str) {
        if(str.length()==0){
            return "";}
        if(str.startsWith("oz")){
            return str.substring(0,2);
        } else if (str.charAt(0)=='o') {
            return str.substring(0,1);
        } else if (str.charAt(1)=='z') {
            return str.substring(1,2);
        }
        else{
            return "";
        }
    }
    public int intMax(int a, int b, int c) {

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public int close10(int a, int b) {
        int ad=Math.abs(10-a);
        int bd=Math.abs(10-b);
        if(ad<bd){
            return a;
        }
        if(ad>bd){
            return b;
        }
        return 0;

    }
    public boolean in3050(int a, int b) {
        if(a>=30&&a<=40&&b>=30&&b<=40){
            return true;
        }
        else if(a>=40&&a<=50&&b>=40&&b<=50){
            return true;
        }
        else{
            return false;
        }
    }
    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20){
            return a;
        }
        if (b >= 10 && b <= 20){
            return b;
        }
        return 0;
    }
    public boolean stringE(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                count++;
            }
        }
        return (count>=1&&count<=3);
    }
    public boolean lastDigit(int a, int b) {
        if(a%10==b%10){
            return true;
        }
        else{
            return false;
        }
    }
    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        } else {
            return str.substring(0,str.length()-3).concat(str.toUpperCase().substring(str.length()-3));
        }

    }
    public String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i=i+n) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
