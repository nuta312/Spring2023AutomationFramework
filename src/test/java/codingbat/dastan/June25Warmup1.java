package codingbat.dastan;

public class June25Warmup1 {

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        if( temp1 < 0 && temp2 > 100 ){
            return true;
        }else if(temp1 > 100 && temp2 < 0){
            return true;
        }
        return false;
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen)||(!aTeen && bTeen);
    }


    public String delDel(String str) {
        if(str.length() > 3 && str.substring(1,4).equals("del")){
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }


    public boolean mixStart(String str) {
        if(str.length() < 3){
            return false;
        }
        String sub = str.substring(0,3);
        if(sub.charAt(1) == 'i' && sub.charAt(2) == 'x'){
            return true;
        }
        return false;
    }


    public String startOz(String str) {
        if(str.length() <2){
            return str;
        }
        if(str.substring(0,2).equals("oz")){
            return "oz";
        }else if(str.charAt(0) == 'o' && str.charAt(1) != 'z'){
            return "o";
        }else if(str.charAt(0) != 'o' && str.charAt(1) == 'z'){
            return "z";
        }
        return "";
    }


    public int intMax(int a, int b, int c) {
        if(a > b && a > c){
            return a;
        } else if(b > a && b > c){
            return b;
        }else if(c > a && c > b){
            return c;
        }
        return 0;
    }


    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

}
