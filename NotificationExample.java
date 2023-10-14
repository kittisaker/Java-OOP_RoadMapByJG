public class NotificationExample {
    public static void main(String[] args) {
        final Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1 is working.");
                try {
                    lock.wait();  // Thread 1 waits for a notification
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 is awake.");
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 is working.");
                try {
                    lock.wait();  // Thread 2 waits for a notification
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 is awake.");
            }
        });

        Thread thread3 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 3 is notifying other threads.");
                lock.notifyAll();  // Notify all waiting threads
            }
        });

        thread1.start();
        thread2.start();

        // Sleep to ensure threads 1 and 2 start waiting before thread 3 notifies them
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();
    }
}
