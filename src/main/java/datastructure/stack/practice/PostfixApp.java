package datastructure.stack.practice;

/**
 * Created by Administrator on 2017/8/30.
 */
public class PostfixApp {

    public static void main(String[] args) {
        String input = "23*4+";
        ParsePost aParser = new ParsePost(input);
        int output = aParser.doParse();
        System.out.println("Evaluates to " + output);
    }
}
