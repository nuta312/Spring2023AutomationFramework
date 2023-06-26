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

    public String startOz(String str) {
        if(str.length()==0){
            return "";}
        if(str.startsWith("oz")){
            return str.substring(0,2);
        } else if (str.charAt(0)=='o') {
            return str.substring(0,1);
        } else if (str.charAt(1)=='z') {
            return str.substring(1,2);
        }
        else{
            return "";
        }
    }
}
