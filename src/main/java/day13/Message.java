package day13;

import java.util.Date;

public class Message {
   private final User sender;
    private final User receiver;
    private final String text;
    private final Date date;

    public Message(User sender, User reciver, String text) {
        this.sender = sender;
        this.receiver = reciver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "FROM: " + sender +
                "TO: " + receiver +
                "ON " + date +
                "MESSAGE: " + text;
    }


}
