package org.example.structural;

public class DecoratorExampleRunner {
    public static void main(String[] args) {

        Notifier source = new SourceNotifier();
        Notifier slack = new SlackDecoratorNotifier(source);
        Notifier facebook = new FacebookDecoratorNotifier(slack);

        facebook.send();

    }
}