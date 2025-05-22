public class EmailMessage extends Message {

    public EmailMessage(ILogin emailLogin, String sender, String recipient, String content) {
        super(emailLogin, sender, recipient, content);
    }

    @Override
    public void send(String username, String password) {
        if (getLogin().authenticate(username, password)) {
            System.out.println("Email sent from " + getSender() + " to " + getRecipient() + ": " + getContent());
        } else {
            System.out.println("Authentication failed for user: " + username);
        }
    }
}
