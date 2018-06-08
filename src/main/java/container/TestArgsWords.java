package container;

import java.util.HashMap;
import java.util.Map;

public class TestArgsWords {
    private static final int ONE = 1;

    public static void main(String[] args) {
        // Collection Generic
        Map<String, Integer> hashMap = new HashMap();
        for (int i = 0; i < args.length; i++) {
            if (!hashMap.containsKey(args[i])) {
                hashMap.put(args[i], ONE);
            } else {
                // unboxing
                int freq = hashMap.get(args[i]);
                hashMap.put(args[i], freq + 1);
            }
//            int num =  hashMap.get(args[i]) == null ? 0 :  (Integer) hashMap.get(args[i]);
//            hashMap.put(args[i], num == 0 ? ONE : num + 1);
        }
        System.out.println(hashMap.size() + " distinct words detected");
        System.out.println(hashMap);
    }
}
