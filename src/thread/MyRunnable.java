package thread;

// 방법 1
public class MyRunnable implements Runnable {

    private int id;

    public MyRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 50; i++) {
                System.out.printf("My Runnable_%d : i = %d\n", id, i);
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
숙제 : MyThread 안에도 Thread.sleep(1) 을 줘보고
Program 에도 Thread.sleep(1) 줘보고
실행해보고 눈으로 확인해보기.
 */