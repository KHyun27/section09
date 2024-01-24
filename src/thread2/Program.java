package thread2;

public class Program {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        MyThread th1 = new MyThread(sharedResource);
        MyThread th2 = new MyThread(sharedResource);
        th1.start();
        th2.start();

        try {
            th1.join(); // thread의 처리가 끝나길 이 지점에서 대기한다.
            th2.join(); // thread의 처리가 끝나길 이 지점에서 대기한다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(sharedResource.getSharedValue());

    }
}
