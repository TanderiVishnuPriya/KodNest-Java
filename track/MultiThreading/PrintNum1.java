public class PrintNum1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing num activity started..");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing num activity completed..");
    }
}
