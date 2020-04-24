public class Main {
    public static void main(String [] argv) {

        Thread t = new Thread(new MyThread()); // Method 1
        // Thread t = new MyThread(); // Method 2

        t.start();

        for(int i=0; i<100000; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello Main");
        }

    }

}