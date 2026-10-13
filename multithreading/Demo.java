package multithreading;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Child thread is running");
    }
}

public class Demo {
    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();

        System.out.println("Main thread is running");
    }
}
