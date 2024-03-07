package _8.chain;

public class EmailMessageSender extends MessageSender{
    public EmailMessageSender(Integer priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
