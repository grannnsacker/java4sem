package _8.chain;

public class LogReportMessageSender extends MessageSender{
    public LogReportMessageSender(Integer priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Message sender using simple log report: " + message);
    }
}
