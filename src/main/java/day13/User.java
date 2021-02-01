package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    private String username;
    private List<User> subscriptions = new ArrayList<>();


    public User(String username) {
        this.username = username;
        this.subscriptions.clear();
    }

    public void subscribe(User user) { //подписывает пользователя на пользователя
        user.subscriptions.add(User.this);
    }

    public boolean isSubscribed(User user) { //возвращает True, если пользователь подписан на пользователя user и False, если не подписан
        if (subscriptions.contains(user)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFriend(User user) {//возвращает True, если пользователь user является другом и False, если пользователь user не является другом. Подумайте, что такое дружба в контексте соц. сетей.
        if (subscriptions.contains(user) & user.subscriptions.contains(User.this)) {
            return true;
        } else {
            return false;
        }

    }

    public void sendMessage(User user, String text) { //отправляет сообщение с текстом text пользователю user. Здесь должен использоваться статический метод из MessageDatabase.
        MessageDatabase.addNewMessage(User.this, user, text);
    }
}
