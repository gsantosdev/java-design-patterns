package org.example.structural;

public class FacebookDecoratorNotifier extends BaseNotifierDecorator {
    public FacebookDecoratorNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Facebook Notifier");
    }
}
