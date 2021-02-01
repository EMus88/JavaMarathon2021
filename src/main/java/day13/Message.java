package day13;

import java.util.Date;

public class Message {
    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    private User sender;
    private User receiver;
    private String text;
    private Date date = new Date();

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;

    }
    public String toString(){
        return "FROM: " + sender + "\n" + "TO: " + receiver + "\n" +  "ON: " +this.date + "\n" + "Текст сообщения" + text;

    }

}
