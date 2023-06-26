package codingbat.aygerim.WarmUp1HomeWorks;

public class WarmUp24June {
    public String frontBack(String str) {
        if (str.length()<=1){
            return str;
        }
        return str.charAt (str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0);
    }
    public String front3(String str) {
        String str1;
        if(str.length()>=3){
            str1= str.substring(0,3);
        } else {
            str1 = str;
        }
        return str1+str1+str1;
    }
    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }
    public String front22(String str) {
    int take = 2;
  if (take > str.length()) {
        take = str.length();
    }
    String front = str.substring(0, take);
  return front + str + front;
}
    public boolean startHi(String str) {
        if (str.startsWith("hi")){
            return true;
        }
        return false;
    }
    public boolean icyHot(int temp1, int temp2) {
        if((temp1<0 && temp2 > 100)||(temp1>100 && temp2<0)){
            return true;
        } return false;
    }
    public boolean in1020(int a, int b) {
        if ((a>=10 && a<=20) || (b>=10 && b<=20)){
            return true;
        } return false;
    }
    public boolean hasTeen(int a, int b, int c) {
        if ((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)){
            return true;
        } return false;
    }
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }
}
