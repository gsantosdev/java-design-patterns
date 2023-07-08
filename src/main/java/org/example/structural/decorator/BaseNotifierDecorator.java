package org.example.structural.decorator;

public class BaseNotifierDecorator implements Notifier {
    private Notifier notifier;

    public BaseNotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
    }
}
