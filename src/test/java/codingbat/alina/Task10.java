package codingbat.alina;

public class Task10 {
    public String delDel(String str) {
        if(str.length()==0){
            return "";
        }
        else  if(str.substring(1).startsWith("del")) {
            StringBuilder sb = new StringBuilder(str);
            sb.delete(1, 4);
            return sb.toString();
        }
        else {
            return str;
        }
    }
    public boolean mixStart(String str) {
        if(str.length()<3){
            return false;
        }
        else if(str.charAt(0)!='m'&&str.substring(1,3).equals("ix")||str.charAt(0)=='m'){
            return true;
        }
        else{
            return false;
        }
    }
}
