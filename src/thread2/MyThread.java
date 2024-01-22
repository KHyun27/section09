package thread2;

public class MyThread extends Thread {

    private SharedResource sharedResource;

    public MyThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        // sharedResource.incSharedValue();
        sharedResource.decSharedValue();
    }
}
