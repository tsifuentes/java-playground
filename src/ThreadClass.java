class ThreadName extends Thread {
    public ThreadName(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.println("Started thread");
        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName());
        }
        System.out.println("Ended thread");
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        Thread thread = new ThreadName("Thomas");
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        Thread thread2 = new ThreadName("Israel");
        thread2.start();
    }
}
