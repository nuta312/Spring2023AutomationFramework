package codingbat.Nariman;

public class ThirdcodigHW
{
    public static void main(String[] args) {

    }
    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);


        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }public String front3(String str) {
    if(str.length()<=2)
        return str+str+str;
    String m = str.substring(0,3);
    return m+m+m;
}public String backAround(String str) {
    String last = str.substring(str.length()-1);
    return last+str+last;
}public boolean or35(int n) {
    return  (n%3==0) || (n%5==0);

}
    public String front22(String str) {
        int f=2;
        if(f>str.length()){
            f=str.length();
        }
        String front = str.substring(0,f);
        return front+str+front;
    }
}
