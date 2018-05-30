package container;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Created by Administrator on 2018/5/18.
 */
public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("four", 4);
        hashMap.put("five", 5);
        hashMap.put("six", null);


        //遍历Map中的key的HashMap
        for (String str: hashMap.keySet()) {
            System.out.println(str + "+" + str.hashCode());
        }

        //遍历键值对
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        for ( Entry<String, Integer> e: entrySet) {
            System.out.print("key:" + e.getKey() + "\t");
            System.out.println("value:" + e.getValue());
        }


    }
}
