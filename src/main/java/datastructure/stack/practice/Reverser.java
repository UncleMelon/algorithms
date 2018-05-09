package datastructure.stack.practice;

/**
 * Created by Matthew on 8/27/2017.
 */
public class Reverser {
    private String input;           // input string
    private String output;          // output string

    public Reverser(String in) {    // constructor
        input = in;
    }

    public String doRev() {                 // reverse the string
        int stackSize = input.length();     // get max stack size
        StackC theStack = new StackC(stackSize);      // make stack

        for(int i=0; i<stackSize; i++){
            char ch = input.charAt(i);      // get a char from input
            theStack.push(ch);              // push it
        }

        output = "";

        while(!theStack.isEmpty()){
            char ch = theStack.pop();       // pop a char,
            output = output + ch;           // append to output
        }

        return output;
    }
}
