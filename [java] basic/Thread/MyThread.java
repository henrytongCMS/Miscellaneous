
class MyThread implements Runnable {  // Method 1
// class MyThread extends Thread {  // Method 2

    @Override
    public void run() {
        
        for(int i=0; i<100000; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello Thread");
        }
        
    }

}
