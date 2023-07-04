package codingbat.kamiii;

public class MissingChar {
    public String missingChar(String str, int n) {
        String before = str.substring(0, n);
        String after = str.substring(n + 1);


        return before + after;
    }

}
