package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    String username;
    List<User> subscription = new ArrayList<>();

    public User(String username) {
        this.username = username;
        this.subscription = new ArrayList<>();
    }

    public void subscribe(User user) {
        this.subscription.add(user);
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscription() {
        return subscription;
    }

    public boolean isSubscribed(User user) {
        for (User ourUser : subscription)
            if (ourUser.getUsername().equals(user.getUsername()))
                return true;
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String string) {

    }

    @Override
    public String toString() {
        return "User" +
                "username='" + username + '\'' +
                '}';
    }
}
