package algorithms.recursion;

/**
 * Created by Administrator on 2017/9/4.
 */
public class BinarySearchApp {

    public static void main(String[] args) {
        int maxSize = 100;              // array size
        ordArray arr;                   // referenece to array
        arr = new ordArray(maxSize);    // create the array

        arr.insert(72);         // insert items
        arr.insert(90);
        arr.insert(45);
        arr.insert(126);
        arr.insert(54);
        arr.insert(99);
        arr.insert(144);
        arr.insert(27);
        arr.insert(135);
        arr.insert(81);
        arr.insert(16);
        arr.insert(108);
        arr.insert(9);
        arr.insert(117);
        arr.insert(63);
        arr.insert(36);
        arr.display();              // display array

        int searchKey = 27;         // search for item
        if(arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
    }
}
