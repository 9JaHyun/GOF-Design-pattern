package _05_prototype_pattern._02_after;

import java.util.Objects;

public class Invitation implements Cloneable {

    private String to;
    private String tel;

    private InvitationInfo invitationInfo;

    public Invitation(InvitationInfo invitationInfo) {
        this.invitationInfo = invitationInfo;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public InvitationInfo getInvitationInfo() {
        return invitationInfo;
    }

    public void setInvitationInfo(InvitationInfo invitationInfo) {
        this.invitationInfo = invitationInfo;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); => 얕은 복사

        // 깊은 복사
        InvitationInfo invitationInfo = new InvitationInfo();
        invitationInfo.setFrom(this.invitationInfo.getFrom());
        invitationInfo.setLocation(this.invitationInfo.getLocation());

        Invitation invitation = new Invitation(invitationInfo);
        invitation.setTo(to);
        invitation.setTel(tel);
        return invitation;
    }

    public String sendInvitation() {
        return "==== 청첩장 ====\n" +
            "내용 중략..\n" +
            "위치: " + invitationInfo.getLocation() + "\n" +
            "받는 사람: " + to + "님\n" +
            "보내는 사람: " + invitationInfo.getFrom();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Invitation that = (Invitation) o;
        return Objects.equals(to, that.to) && Objects.equals(tel, that.tel)
            && Objects.equals(invitationInfo, that.invitationInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, tel, invitationInfo);
    }
}
