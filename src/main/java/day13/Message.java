package day13;

import java.util.Date;

public class Message {
   private final User sender;
    private final User reciver;
    private final String text;
    private final Date date;

    public Message(User sender, User reciver, String text) {
        this.sender = sender;
        this.reciver = reciver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReciver() {
        return reciver;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "FROM: " + sender +
                "TO: " + reciver +
                "ON " + date +
                "MESSAGE: " + text;
    }


}
