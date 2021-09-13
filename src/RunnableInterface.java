class RunnableI implements Runnable{
    private String name;

    public RunnableI(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " = " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Closing thread at " + this.getName());
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        Runnable runnable = new RunnableI("Thomas");
        Thread thread = new Thread(runnable);
        thread.start();

        new Thread(new RunnableI("Israel")).start();
        new Thread(new RunnableI("Sifuentes")).start();
        new Thread(new RunnableI("Martinez")).start();
    }
}