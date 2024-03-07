package _8.chain;

public class SMSMessageSender extends MessageSender{
    public SMSMessageSender(Integer priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}
