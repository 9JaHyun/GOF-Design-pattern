package _05_prototype_pattern._01_before;

public class Client {

    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.setName("홍길동");
        guest.setTel("010-1111-2222");

        Invitation invitation = new Invitation(guest);
        invitation.setFrom("곧 행복해질사람");
        invitation.setLocation("서울시 ...");

        String message = invitation.sendInvitation();
        System.out.println(message);
    }
}
