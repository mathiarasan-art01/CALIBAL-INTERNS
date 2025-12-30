class Chat {
    boolean flag = false;

    synchronized void question(String msg) throws InterruptedException {
        if (flag)
            wait();
        System.out.println(msg);
        flag = true;
        notify();
    }

    synchronized void answer(String msg) throws InterruptedException {
        if (!flag)
            wait();
        System.out.println(msg);
        flag = false;
        notify();
    }
}

public class InterThreadDemo {
    public static void main(String[] args) {
        Chat c = new Chat();

        new Thread(() -> {
            try {
                c.question("Hi");
                c.question("How are you?");
            } catch (Exception e) {
            }
        }).start();

        new Thread(() -> {
            try {
                c.answer("Hello");
                c.answer("I am fine");
            } catch (Exception e) {
            }
        }).start();
    }
}
