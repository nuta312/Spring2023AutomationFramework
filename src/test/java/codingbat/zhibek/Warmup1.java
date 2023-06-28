package codingbat.zhibek;

public class Warmup1 {
    public static void main(String[] args) {
                boolean weekday = true;
                boolean vacation = false;
                boolean result = sleepIn(weekday, vacation);
                System.out.println(result);
            }
            public static boolean sleepIn(boolean weekday, boolean vacation) {
                return !weekday || vacation;
            }
        }



