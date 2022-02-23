package _05_facade_pattern._02_after;

public class User {

    private String nickName;

    public User(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
