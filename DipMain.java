package dip;

public class DipMain {
    public static void main(String[] args) {
        OrderProcessor emailOrder = new OrderProcessor(new EmailNotifier());
        emailOrder.processOrder();

        OrderProcessor smsOrder = new OrderProcessor(new SMSNotifier());
        smsOrder.processOrder();
    }
}