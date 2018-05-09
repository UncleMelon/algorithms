package datastructure.stack.practice;

/**
 * Created by Administrator on 2017/8/30.
 */
public class InfixApp {

    public static void main(String[] args) {
        String input = "3*(5+4*(3+6))+5";
        InToPost theTrans = new InToPost(input);
        String output = theTrans.doTrans();
        System.out.println("Postfix is " + output + '\n');
    }
}
