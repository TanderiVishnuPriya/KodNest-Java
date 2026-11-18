public class MultipleThreads {
    public static void main(String[] args) {
        Addition ad = new Addition();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();
        ad.start();
        pn.start();
        pc.start();
    }
}
