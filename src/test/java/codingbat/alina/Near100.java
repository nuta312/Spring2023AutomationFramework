package codingbat.alina;

public class Near100 {
    public static void main(String[] args) {
    }
        public boolean nearHundred(int n) {
            return ((Math.abs(100-n)<=10)||(Math.abs(200-n)<=10));
        }
    public String notString(String str) {
        if(!(str.startsWith("not"))){
            return "not "+ str;
        }
        else{
            return str;
        }
    }
    public String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(n);
        return sb.toString();
    }
    public String frontBack(String str) {
        if(str.length()==1||str==""){
            return str;
        }
        else{
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            return last + middle + first;
        }
    }
}
