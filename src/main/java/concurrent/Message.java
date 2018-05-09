package concurrent;

/**
 * Created by Administrator on 2018/3/21.
 */
public class Message {
    private String msg;

    public Message(String str) {
        this.msg = str;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
