package _8.chain;

public class Main {
    public static void main(String[] args) {
        MessageSender reportMessageSender = new LogReportMessageSender(1);
        MessageSender emailMessageSender = new EmailMessageSender(2);
        MessageSender smsMessageSender = new SMSMessageSender(3);

        reportMessageSender.setNextMessageSender(emailMessageSender);
        emailMessageSender.setNextMessageSender(smsMessageSender);

        reportMessageSender.messageSenderManager("First level", 1);

        System.out.println("---------------------------------------------------------------------");
        reportMessageSender.messageSenderManager("Second level", 2);

        System.out.println("---------------------------------------------------------------------");
        reportMessageSender.messageSenderManager("Third level", 3);
    }
}
