package codingbat.begimai.String1;

public class conCat {
    public String conCat(String a, String b) {
        if(b.length()==0 || a.length()==0){
            return a+b;
        }
        if(a.substring(a.length()-1, a.length()).equals(b.substring(0,1))){
            return a.substring(0,a.length())+ b.substring(1,b.length());
        }else{
            return a+b;
        }
    }
}
