package badCode.d;

public class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {

        this.notifier = notifier;
    }

    void sendNotification(String recipient, String message) {

        notifier.sendNotification(recipient,message);
    }
}
