package codingbat.tilek;

public class String2 {


    public String repeatEnd(String str, int n) {

        String aLast = str.substring(str.length()-n);
        String result = "";
        for (int i = 0; i < n; i++){
            result += aLast;
        }
        return result;
    }

    public boolean sameStarChar(String str) {


        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String doubleChar(String str) {
        String result = " ";
        for (int i = 0; i < str.length(); i++){
            result = result + str.charAt(i)+str.charAt(i);
        }
        return result.trim();
    }

    public int countHi(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {


        int cat = 0;
        int dog = 0;

        for ( int i = 0; i < str.length()-2; i++){

            String name = str.substring(i,i+3);

            if (name.equals("cat")){
                cat++;
            }
            else if (name.equals("dog")){
                dog++;
            }
        }

        if (cat==dog){
            return true;
        }
        return false;
    }

    public int countCode(String str) {

        int count = 0;
        for (int i = 0; i < str.length()-3; i++){
            if (str.substring(i,i+4).equals("code") || str.substring(i,i+4).equals("cope") ||
                    str.substring(i,i+4).equals("cooe") ||str.substring(i,i+4).equals("coze")||
                    str.substring(i,i+4).equals("core") || str.substring(i,i+4).equals("cole")){
                count++;
            }
        }
        return count;
    }


}
