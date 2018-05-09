package datastructure.array.basicarray;

/**
 * Created by Administrator on 2017/8/25.
 */
public class HighArrayApp {

    /**
     * 类(HighArrayApp)用户可以集中精力于做什么而不是怎么做
     * 类用户甚至不必知道HighArray类中使用何种数据结构来存储数据。结构被隐藏在接口之后
     * 从what(什么)中将how(如何)分离出来的过程，即类中的操作如何进行，相对什么是类用户可以见的，被称为抽象。
     * @param args
     */
    public static void main(String[] args) {
        int maxSize = 100;          // array size
        HighArray arr;              // reference to array
        arr = new HighArray(maxSize); // create the array

        arr.insert(77);             // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();              // display items

        int searchKey = 35;         // search for item
        if (arr.find(searchKey)) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }

        arr.delete(00);             // delete 3 items
        arr.delete(55);
        arr.delete(99);

        arr.display();              // display items again
    }
}
