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
}
