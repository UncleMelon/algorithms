package datastructure.stack.practice;


/**
 * Created by Administrator on 2017/8/29.
 */
public class InToPost {         // infix to postifx conversion
    private StackC theStack;
    private String input;
    private String output = "";

    public InToPost(String in) {    // constructor
        input = in;
        int stackSize = input.length();
        theStack = new StackC(stackSize);
    }

    public void gotOper(char opThis, int prec1) {       // got operator from input
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();            // if it's a '('
            if(opTop == '(') {
                theStack.push(opTop);               // restore '('
                break;
            }
            else {                                  // it's an operator
                int prec2;

                if(opTop=='+' || opTop=='-')        // find new op prec
                    prec2 = 1;
                else
                    prec2 = 2;
                if(prec2 < prec1) {                 // if prec of new op less than prec of old
                    theStack.push(opTop);           // save newly-popped op
                    break;
                }
                else {                              // prec of new not less
                    output = output + opTop;        // than prec of old
                }

            }
        }
        theStack.push(opThis);                      // push new operator
    }

    public void gotParen(char ch) {                 // got right paren from input
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if(chx == '(')                  // if popped '('
                break;                      // we're done
            else                            // if popped operator
                output = output + chx;      // output it
        }
    }

    public String doTrans() {               // do translation to postfix
        for(int j=0; j<input.length(); j++) {
            char ch = input.charAt(j);
            theStack.displayStack("For "+ch+" ");       // *diagnostic*
            switch (ch) {
                case '+':               // it's + or -
                case '-':
                    gotOper(ch, 1);     // go pop operators
                    break;              // (precedence 1)
                case '*':               // it's * or /
                case '/':
                    gotOper(ch, 2);     // go pop operators
                    break;              // (precedence 2)
                case '(':               // it's a left paren
                    theStack.push(ch);  // push it
                    break;
                case ')':               // it's a right paren
                    gotParen(ch);       // go pop operators
                    break;
                default:                // musst be an operand
                    output = output + ch; // write it to output
                    break;
            }
        }

        while (!theStack.isEmpty()) {       // pop remaining opers
            theStack.displayStack("While ");    // *diagnostic*
            output = output + theStack.pop();   // write to output
        }
        theStack.displayStack("End    ");       // *diagnostic*
        return output;
    }
}
