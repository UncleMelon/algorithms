package datastructure.stack.practice;

/**
 * Created by Administrator on 2017/8/28.
 */
public class BracketChecker {
    private String input;       // input string

    public BracketChecker(String in) {      // constructor
        input = in;
    }

    public void check() {
        int stackSize = input.length();     // get max stack size
        StackC theStack = new StackC(stackSize);     // make stack

        for(int j=0; j<input.length(); j++) {       // get chars in turn
            char ch = input.charAt(j);      // get char
            switch (ch) {
                case '{':                   // opening symbols
                case '[':
                case '(':
                    theStack.push(ch);      // push them
                    break;
                case '}':
                case ']':
                case ')':
                    if(!theStack.isEmpty()) {
                        char chx = theStack.pop();
                        if((ch=='}' && chx!='{') ||
                           (ch==']' && chx!='[') ||
                           (ch==')' && chx!='('))
                            System.out.println("Error: " + ch + " at " + j);
                    }
                    else        // prematurely empty
                        System.out.println("Error: " + ch + " at " + j);
            }
        }
        if (!theStack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    }

}
