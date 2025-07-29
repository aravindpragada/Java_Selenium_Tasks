package com.java.multithreading;

class Chat {
    boolean isSenderTurn = true;

    synchronized void sendMessage(String msg) {
        while (!isSenderTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Sender interrupted.");
            }
        }
        System.out.println("Sender: " + msg);
        isSenderTurn = false;
        notify();
    }

    synchronized void receiveMessage(String msg) {
        while (isSenderTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Receiver interrupted.");
            }
        }
        System.out.println("Receiver: " + msg);
        isSenderTurn = true;
        notify();
    }
}

class Sender extends Thread {
    Chat chat;
    String[] messages = {"Hi!", "How are you?", "I’m doing great!", "Bye"};

    public Sender(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        for (String msg : messages) {
            chat.sendMessage(msg);
        }
    }
}

class Receiver extends Thread {
    Chat chat;
    String[] replies = {"Hello!", "I’m fine. You?", "Nice to hear!", "See you"};

    public Receiver(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        for (String msg : replies) {
            chat.receiveMessage(msg);
        }
    }
}

public class Task10 {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Sender sender = new Sender(chat);
        Receiver receiver = new Receiver(chat);

        sender.start();
        receiver.start();
    }
}

