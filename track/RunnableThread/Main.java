package track.RunnableThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread Execution Started and Opened File");
        Addition ad = new Addition();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();
        ad.start();
        pn.start();
        pc.start();
        try {
            ad.join();
            pn.join();
            pc.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread Excution Completed and Closed File");
    }
}
