package datastructure.stack.practice;

/**
 * Created by Administrator on 2017/8/28.
 */
public class ReverseApp {

    public static void main(String[] args) {
        String input, output;
        input = "part";

        Reverser theReverser = new Reverser(input);     // make a Reverser
        output = theReverser.doRev();                   // use it
        System.out.println("Reversed: " + output);
    }
}
