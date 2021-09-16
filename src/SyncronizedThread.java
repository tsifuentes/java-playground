class RunnableClass implements Runnable {
    private String phrase1, phrase2;

    public RunnableClass(String phrase1, String phrase2, boolean isSync) {
        this.phrase1 = phrase1;
        this.phrase2 = phrase2;
    }

    @Override
    public void run() {
        try {
            SyncronizedThread.showMessage(this.phrase1, this.phrase2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class SyncronizedThread {
    public static void main(String[] args) {
        Thread v1 = new Thread(new RunnableClass("Hola, ", "Soy Thomas"));
        Thread v2 = new Thread(new RunnableClass("Como ", "estas?"));
        Thread v3 = new Thread(new RunnableClass("Vamos a ", "divertirnos"));
        v1.start();
        v2.start();
        v3.start();
    }
    public static void showMessage(String phrase1, String phrase2) throws InterruptedException {
        System.out.print(phrase1);
        Thread.sleep(500);
        System.out.println(phrase2);
    }
}
