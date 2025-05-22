public class SMSMessage extends Message {

    public SMSMessage(ILogin smsLogin, String sender, String recipient, String content) {
        super(smsLogin, sender, recipient, content);
    }

    @Override
    public void send(String username, String password) {
        if (getLogin().authenticate(username, password)) {
            System.out.println("SMS sent from " + getSender() + " to " + getRecipient() + ": " + getContent());
        } else {
            System.out.println("SMS authentication failed for user: " + username);
        }
    }
}
