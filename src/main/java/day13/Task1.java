package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
        user1.subscribe(user2);
        user2.subscribe(user1);
        System.out.println(user1.isFriend(user2));

        user1.sendMessage(user2, "Привет");
        user1.sendMessage(user2, "как дела?");
        user2.sendMessage(user1, "как дела?");
        user2.sendMessage(user1, "как дела?");
        user2.sendMessage(user1, "как дела?");
        user3.sendMessage(user1, "как дела?");
        user3.sendMessage(user1, "как дела?");
        user3.sendMessage(user1, "как дела?");
        user1.sendMessage(user3, "Привет");
        user1.sendMessage(user3, "Привет");
        user1.sendMessage(user3, "Привет");
        user3.sendMessage(user1, "нормально");

        MessageDatabase.showDialog(user1, user3);
        System.out.println(MessageDatabase.getMessages().get(3).getDate());
    }
}
