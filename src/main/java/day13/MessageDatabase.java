package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static final List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String message){
        messages.add(new Message(u1, u2, message));

    }

    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){
        for (Message message : messages){
            if (message.getSender() == u1 && message.getReceiver() == u2
            || message.getSender() == u2 && message.getReceiver() == u1){
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }


}

