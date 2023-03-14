package day13;

public class Task1 {
    public static void main(String[] args) {
    User user = new User("Nikita");
    User user2 = new User("Danil");
    User user3 = new User("Stepan");


    user.isSubscribed(user2);
    user.subscribe(user3);
    user3.subscribe(user);
    user.isFriend(user3);
    user2.subscribe(user);
    user.isSubscribed(user);

    user.sendMessage(user2, "Во время плаванья, когда в толпе матросов");
    user.sendMessage(user2, "Случается поймать над бездною морей");
    user2.sendMessage(user, "Огромных белых птиц, могучих альбатросов,");
    user2.sendMessage(user, "Беспечных спутников отважных кораблей,");

    user2.sendMessage(user, "На доски их кладут: и вот, изнемогая");
    user3.sendMessage(user, "Труслив и неуклюж, как два больших весла,");
    user3.sendMessage(user, "Влачит недавний царь заоблачного края");
    user3.sendMessage(user, "По грязной палубе два трепетных крыла.");

    user.sendMessage(user3, "Лазури гордый сын, что бури обгоняет,");
    user.sendMessage(user3, "Он стал уродливым, и жалким, и смешным,");
    user.sendMessage(user3, "Зажженной трубкою матрос его пугает");
    user3.sendMessage(user, "И дразнит с хохотом, прикинувшись хромым.");

        MessageDatabase.showDialog(user, user3);

    }
}
