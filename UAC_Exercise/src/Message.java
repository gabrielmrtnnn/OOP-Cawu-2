
public abstract class Message {
    private ILogin login;
    private String sender;
    private String recipient;
    private String content;

    public Message(ILogin login, String sender, String recipient, String content) {
        this.login = login;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public ILogin getLogin() {
        return login;
    }


    public String getSender() {
        return sender;
    }
    public String getRecipient() {
        return recipient;
    }

    public String getContent() {
        return content;
    }

    public abstract void send(String username, String password);

}
