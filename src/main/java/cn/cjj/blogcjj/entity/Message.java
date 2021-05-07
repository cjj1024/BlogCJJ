package cn.cjj.blogcjj.entity;

/**
 * @author CuiJunJie
 * @create 2021/4/30-11:07
 */
public class Message {
    private int state;
    private String message;

    public Message() {
    }

    public Message(int state, String message) {
        this.state = state;
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "state=" + state +
                ", message='" + message + '\'' +
                '}';
    }
}
