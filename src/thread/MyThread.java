package thread;

public class MyThread extends Thread {

    private final int id;

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 50; i++) {
                System.out.printf("My thread_%d : i = %d\n", id, i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
