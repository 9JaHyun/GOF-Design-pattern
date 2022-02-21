package _05_prototype_pattern._02_after;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        InvitationInfo invitationInfo = new InvitationInfo();
        invitationInfo.setFrom("곧 행복해질사람");
        invitationInfo.setLocation("서울시 ...");


        Invitation invitation = new Invitation(invitationInfo);
        invitation.setTo("홍길동");
        invitation.setTel("010-1111-2222");

        String message = invitation.sendInvitation();
//        System.out.println(message);

        Invitation cloneInvitation = (Invitation) invitation.clone();
        // 얕은 복사: true / 깊은 복사: false
        System.out.println(
            "invitation.equals(cloneInvitation): " + invitation.equals(cloneInvitation));

        System.out.println("invitation != cloneInvitation: " + (invitation != cloneInvitation));
        System.out.println(
            "invitation.getClass() == cloneInvitation.getClass(): " + (invitation.getClass()
                == cloneInvitation.getClass()));

        // 얕은 복사: true / 깊은 복사: false
        System.out.println("invitation.getInvitationInfo() == cloneInvitation.getInvitationInfo(): " +
            (invitation.getInvitationInfo() == cloneInvitation.getInvitationInfo()));

        // 일부분만 고치면 된다.
        cloneInvitation.setTo("홍길동2");
        cloneInvitation.setTel("010-2222-3333");
        System.out.println(cloneInvitation.sendInvitation());
    }
}
