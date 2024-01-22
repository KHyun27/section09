package thread2;

public class SharedResource {

    private int sharedValue;

    public SharedResource() {
        sharedValue = 1;
    }

    public synchronized void incSharedValue() {
        sharedValue++;
    }

    public synchronized void decSharedValue() {
        if (sharedValue > 0) {
            sharedValue--;
            System.out.println("decSharedValue : " + sharedValue);
        }
    }

    public int getSharedValue() {
        return sharedValue;
    }
}
