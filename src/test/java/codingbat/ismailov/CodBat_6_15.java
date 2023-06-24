package codingbat.ismailov;

public class CodBat_6_15 {
    public boolean makes10(int a, int b) {
        int sum = a +b;
        if(a == 10 || b == 10){
            return true;
        }else if(sum == 10){
            return true;
        }else {
            return false;
        }
    }
    public boolean nearHundred(int n) {
        boolean ans = false;
        if ( n + 10 >= 100 && n - 10 <= 100)
            ans = true;
        else if ( n + 10 >= 200 && n - 10 <=200)
            ans = true;
        return ans;

    }
    public boolean posNeg(int a, int b, boolean negative) {
        if(a > 0 && b < 0 && negative == false){
            return true;
        }
        if(a < 0 && b > 0 && negative == false){
            return true;
        }
        if(a < 0 && b < 0 && negative == true){
            return true;
        }else{
            return false;
        }
    }
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
    public String missingChar(String str, int n) {
        return str.substring(0,n) + str.substring(n+1,str.length());

    }
    public String frontBack(String str) {

        if(str.length() == 1 || str.length() == 0){
            return str;
        } else{
            return str = (str.substring(str.length()-1,str.length()) +
                    str.substring(1,str.length()-1) + str.substring(0,1));

        }


    }
    public String front3(String str) {
        if(str.length() <= 3)
            return str + str + str;
        else{
            String str2 = str.substring(0,3);
            return str2 + str2+ str2;
        }
    }
    public String backAround(String str) {
        char word = str.charAt(str.length()-1);
        return word + str + word;

    }
    public boolean or35(int n) {
        return(n % 3 == 0 || n % 5 == 0);

    }

    public String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            String firstTwoChars = str.substring(0, 2);
            return firstTwoChars + str + firstTwoChars;
        }
    }


}
