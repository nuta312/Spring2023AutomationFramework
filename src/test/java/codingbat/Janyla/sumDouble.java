package codingbat.Janyla;

public class sumDouble {
    public int sumDouble(int a, int b) {
        int result = 0;
        if (a == b) {
            result = (a + b) * 2;
        }
        if (a != b) {
            result = a + b;
        }
        return result;
    }


    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking == true && (hour<=6 || hour>=21)){
            return true;
        } return false;
    }
    public String missingChar(String str, int n) {
        String front= str.substring(0,n);
        String back= str.substring(n+1, str.length());
        return front+back;
    }
    public String frontBack(String str) {
        String result="";
        if(str.length()>=2){
            String a = str.substring(0, 1);
            String b = str.substring(str.length() - 1, str.length());
            result = b + str.substring(1, str.length() - 1)+a;
        }if (str.length()<=1){
            result=str;
        }
        return result;

    }
    public String front3(String str) {
        String result= "";
        if (str.length()>=3){
            String a= str.substring(0, 3);
            result= a+a+a;
        }
        if (str.length()==2){
            String b= str.substring(0, 2);
            result= b+b+b;
        }
        if (str.length()==1){
            String s= str.substring(0, 1);
            result= s+s+s;

        }return result;

    }


}
