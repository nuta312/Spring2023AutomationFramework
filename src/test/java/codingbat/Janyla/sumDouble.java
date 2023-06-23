package codingbat.Janyla;

public class sumDouble {
    public int sumDouble(int a, int b) {
        int result = 0;
        if (a == b) {
            result = (a + b) * 2;
        }
        if (a != b) {
            result = a + b;
        }
        return result;
    }
}
