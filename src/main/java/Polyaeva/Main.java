package Polyaeva;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int count = 4;
        int sleepTime = 15000;

        ThreadGroup group = new ThreadGroup("thread");
        for (int i = 0; i <= count; i++) {
            // MyThread myThread = new MyThread();
            String threadName = (Integer.toString(i + 1));
            Thread thread = new MyThread(group, threadName);
            thread.start();
        }
        Thread.sleep(sleepTime);
        group.interrupt();

        }
    }
