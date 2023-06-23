package codingbat.aidin;

public class sumDouble {
    public int sumDouble(int a, int b) {
        if (a != b){
            return a + b;
        }else if (a == b){
            int sum = a + b;
            sum = sum + sum;
            return sum;
        }return 1;
    }
}
