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


}
