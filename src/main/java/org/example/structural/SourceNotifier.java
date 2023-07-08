package org.example.structural;

public class SourceNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Source Notifier");
    }
}
