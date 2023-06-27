package codingbat.asanjr.warmup1;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {

    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map <String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i; j < strings.length; j++) {
                if (map.containsKey(strings[i]) && strings[i].equals(strings[j])){
                    count=1;
                }

            }
            map.put(strings[i],count);
        }
        return map;
    }


}
