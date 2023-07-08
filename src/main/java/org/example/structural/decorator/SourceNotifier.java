package org.example.structural.decorator;

public class SourceNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Source Notifier");
    }
}
