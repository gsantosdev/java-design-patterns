package org.example.structural;

public class SlackDecoratorNotifier extends BaseNotifierDecorator {
    public SlackDecoratorNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Slack Notifier");
    }
}
