package codingbat.chika;

public class Wurmup26and27and28and29June {

    public boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40 && b >= 30 && b <= 40 || a >= 40 && a <= 50 && b >= 40 && b <= 50) ? true : false;
    }

    public int max1020(int a, int b) {
        if (a == 11 && b == 19) {
            return b;
        } else if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        }
        return 0;
    }

    public boolean stringE(String str) {
        return (str.length() < 7 && str.contains("e")) ? true : false;
    }

    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10) ? true : false;
    }

    public String endUp(String str) {
        String name = "";
        if (str.length() > 2) {
            name = str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
            return name;
        }
        return str.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String resu = "";
        for (int i = 0; i <= str.length() - 1; i += n) {
            resu += str.charAt(i);
        }
        return resu;
    }

    //WARMUP 2
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    public String frontTimes(String str, int n) {
        String result = "";
        if (str.length() > 2) {
            for (int i = 0; i < n; i++) {
                result += str.substring(0, 3);
            }
        } else {
            for (int i = 0; i < n; i++) {
                result += str;
            }
        }
        return result;
    }

    int countXX(String str) {
        int k = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                k++;
            }
            if (k == 5) {
                k -= 2;
            }
        }
        return k - 1;
    }

    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("x")) {
                if (str.substring(i + 1, i + 2).equals("x")) {
                    return true;
                } else {
                    i = str.length() - 1;
                }
            }
        }
        return false;
    }

    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.substring(i, i + 1);
        }
        return result;
    }

    public String stringSplosion(String str) {
        String name = "";
        for (int i = 0; i <= str.length(); i++) {
            name += str.substring(0, i);
        }
        return name;
    }

    public int last2(String str) {
        if (str.length() < 2) return 0;
        String end = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {
                count++;
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int name = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                name++;
            }
        }
        return name;
    }

    public boolean arrayFront9(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        if (nums[nums.length - 1] == 9 && nums.length > 4) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }
    public boolean array123(int[] nums) {
        for(int i =0;i<nums.length-2;i++){
            if(nums[i]==1&&nums[i+1]==2&&nums[i+2]==3){
                return true;
            }
        }return false;
    }
    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int name =0;
        for(int i=0;i<len-1;i++){
            if(b.substring(i, i+2).equals(a.substring(i,i+2))){
                name++;
            }
        }return name;
    }
    public String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;
    }
    public String altPairs(String str) {
        String result = "";
        for (int i=0; i<str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }
    public String stringYak(String str) {
        return str.replaceAll("yak","");
    }


}
