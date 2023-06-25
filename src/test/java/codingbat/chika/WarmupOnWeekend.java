package codingbat.chika;

public class WarmupOnWeekend {
    public boolean makes10(int a, int b) {
        return (a+b==10||a==10||b==10)?true:false ;
    }
    public boolean nearHundred(int n) {
        return (n>10&&20>n||n >=90&&111>n||n >=190&&211>n)?true:false;
    }
    public boolean posNeg(int a, int b, boolean negative) {
        return (negative)?(a<0&&b<0):((a<0&&b>0)||(a>0&&b<0));
    }
    public String notString(String str) {
        return (str.startsWith("not"))?str:"not "+str;
    }
    public String missingChar(String str, int n) {
        return str.substring(0,n)+str.substring(n+1);
    }
    public String frontBack(String str) {
        return (str.length()>1)?str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0):str;
    }
    public String front3(String str) {
        return (str.length()>3)?str.substring(0,3)+str.substring(0,3)+str.substring(0,3):str+str+str;
    }
    public String backAround(String str) {
        return str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
    }
    public boolean or35(int n) {
        return (n%3==0||n%5==0)?true:false;
    }
    public String front22(String str) {
        return (str.length()>2)?str.substring(0,2)+str+str.substring(0,2):str+str+str;
    }

}
