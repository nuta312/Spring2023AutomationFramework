package codingbat.begimai.String1;

public class lastTwo {
    public String lastTwo(String str) {
        if(str.length()<=1){
            return str;
        }
        return str.substring(0,str.length()-2)+str.substring(str.length()-1,str.length())+str.substring(str.length()-2,str.length()-1);
    }

}
