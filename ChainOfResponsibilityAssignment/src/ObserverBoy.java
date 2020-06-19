import java.util.concurrent.TimeUnit;

public class ObserverBoy extends Observer {

    @Override
    public void update() throws InterruptedException {
        System.out.println("Going to pay desk");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Getting package, please be patient.");
        TimeUnit.MILLISECONDS.sleep(12500);
        System.out.println("Bringing package to storage");
        TimeUnit.MILLISECONDS.sleep(1200);
    }
}
