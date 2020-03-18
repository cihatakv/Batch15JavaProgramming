package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    int adminId;

    public SlackAdminUser(int adminId, String name, String status) {
        this.adminId = adminId;
        this.name = name;
        this.status = status;

    }

    public static void main(String[] args) {
        SlackAdminUser s1 = new SlackAdminUser(14, "Akbar", "Online");
        System.out.println("s1 = " + s1);

        // inherited methods we are calling
        s1.sendMessage();
        s1.callSomeone();
        s1.addEmoji();

        // ---our own methods we are calling
        s1.addChannel();
        s1.deleteMessage();
        s1.sendAtChannelMessage();

        System.out.println("s1 = " + s1);


    }

    public void sendAtChannelMessage() {
        System.out.println("Message sent to Channel");
    }

    public void deleteMessage() {
        System.out.println("Admin deleted a message");
    }

    public void addChannel() {
        System.out.println("Admin added a channel");
    }

    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
