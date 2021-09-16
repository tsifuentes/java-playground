class RunnableClass implements Runnable {
    private String phrase1, phrase2;
    boolean isSync;

    public RunnableClass(String phrase1, String phrase2, boolean isSync) {
        this.phrase1 = phrase1;
        this.phrase2 = phrase2;
        this.isSync = isSync;
    }

    @Override
    public void run() {
        try {
            if(this.isSync){
                SyncronizedThread.showMessageSync(this.phrase1, this.phrase2);
            } else {
                SyncronizedThread.showMessageNotSync(this.phrase1, this.phrase2);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class SyncronizedThread {
    public static void main(String[] args) throws InterruptedException {
        Thread v1 = new Thread(new RunnableClass("Hola, ", "Soy Thomas", true));
        Thread v2 = new Thread(new RunnableClass("Como ", "estas?", true));
        Thread v3 = new Thread(new RunnableClass("Vamos a ", "divertirnos", true));
        v1.start();
        v2.start();
        v3.start();
        v1.join();
        v2.join();
        v3.join();
        Thread.sleep(1000);
        System.out.println("End of process without waiting");
    }
    public static void showMessageNotSync(String phrase1, String phrase2) throws InterruptedException {
        System.out.print(phrase1);
        Thread.sleep(1000);
        System.out.println(phrase2);
    }
    public synchronized static void showMessageSync(String phrase1, String phrase2) throws InterruptedException {
        System.out.print(phrase1);
        Thread.sleep(1000);
        System.out.println(phrase2);
    }
}
