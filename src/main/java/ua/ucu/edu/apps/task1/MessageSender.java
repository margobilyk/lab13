package ua.ucu.edu.apps.task1;

public class MessageSender {
    public void send(User user, String text) {
        System.out.println("Message send to" + user);
        System.out.println("Message content" + text);
    }
}
