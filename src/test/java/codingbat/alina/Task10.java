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

}
