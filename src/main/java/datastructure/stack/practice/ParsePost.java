package datastructure.stack.practice;


/**
 * Created by Administrator on 2017/8/30.
 */
public class ParsePost {
    private StackI theStack;
    private String input;

    public ParsePost(String s) {
        input = s;
    }

    public int doParse() {
        theStack = new StackI(20);      // make new stack
        char ch;
        int j;
        int num1, num2, interAns;

        for(j=0; j<input.length(); j++) {
            ch = input.charAt(j);
            theStack.displayStack("" + ch + " ");  // *diagnostic*
            if(ch >= '0' && ch <= '9')              // if it's a number
                theStack.push( (int)(ch-'0'));      // push it
            else {
                num2 = theStack.pop();      // pop operands
                num1 = theStack.pop();
                switch (ch) {               // do arithmetic
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                theStack.push(interAns);
            }
        }
        interAns = theStack.pop();          // get answer
        return interAns;
    }
}
