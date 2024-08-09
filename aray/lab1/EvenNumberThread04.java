class EvenNumberThread04 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        EvenNumberThread04 thread = new EvenNumberThread04();
        thread.start();
    }
}