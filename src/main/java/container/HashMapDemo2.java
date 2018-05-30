package container;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/5/18.
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Card, Person> hashMap = new HashMap<>();
        Person zhangsan = new Person(new Card("001"), "zhangsan");
        Person lisi = new Person(new Card("002"), "lisi");

        hashMap.put(zhangsan.getCard(), zhangsan);
        hashMap.put(lisi.getCard(), lisi);

        System.out.println(hashMap);


        Person zhangsan2 = new Person(new Card("001"), "zhangsan1");
        hashMap.put(zhangsan2.getCard(), zhangsan2);
        System.out.println(hashMap);

    }
}
