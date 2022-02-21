package _05_prototype_pattern._01_before;

public class Invitation {

    private String from;        // 보내는 사람
    private String location;    // 위치
    private Guest guest;

    public Invitation(Guest guest) {
        this.guest = guest;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String sendInvitation() {
        return "==== 청첩장 ====\n" +
            "내용 중략.." +
            "위치: " + location + "\n" +
            "받는 사람: " + guest.getName() + "님\n" +
            "보내는 사람: " + from;
    }
}
