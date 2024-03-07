package _8.chain;

public abstract class MessageSender {
    private final Integer priorityLevel;
    private MessageSender nextMessageSender;

    public MessageSender(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public void setNextMessageSender(MessageSender nextMessageSender) {
        this.nextMessageSender = nextMessageSender;
    }

    public void messageSenderManager(String message, Integer level){
        if(level >= priorityLevel){
            write(message);
        }
        if(nextMessageSender != null){
            nextMessageSender.messageSenderManager(message, level);
        }
    }

    public abstract void write(String message);
}
