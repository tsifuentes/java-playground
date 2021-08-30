public class DBSingleton {
    private static DBSingleton instance;
    private DBSingleton() {
        System.out.println("Connect to DB");
    }
    public static DBSingleton getConnection(){
        if(instance == null){
            instance = new DBSingleton();
        }
        return instance;
    }
}
