package org.example.structural.decorator;

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
