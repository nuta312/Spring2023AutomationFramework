package codingbat.alina;

public class StartHi {
    public boolean startHi(String str) {
        if(str.startsWith("hi")){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean icyHot(int temp1, int temp2) {
        if(temp1>0&&temp2<100||temp1<0&&temp2>100){
            return true;
        }
        else{
            return false;
        }
    }
}
