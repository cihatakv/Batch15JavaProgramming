package day44;

public class SlackUser {
    protected String name;
    protected String status;

    public void sendMessage() {
        System.out.println("Message Sent");
    }

    public void callSomeone() {
        System.out.println("Someone Called");
    }

    public void addEmoji() {
        System.out.println("Added emoji");
    }
}
