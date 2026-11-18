class PrintChar extends Thread {
    @Override
    public void run() {
        System.out.println("Printing char activity started..");
        for (char i = 'A'; i <= 'G'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Printing char activity completed..");
    }
}
