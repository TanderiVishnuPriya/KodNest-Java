public class Main1 {
    public static void main(String[] args) {
        Addition1 ad = new Addition1();
        PrintNum1 pn = new PrintNum1();
        PrintChar1 pc = new PrintChar1();
        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(pn);
        Thread t3 = new Thread(pc);
        t1.start();
        t2.start();
        t3.start();
    }
}
