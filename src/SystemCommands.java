import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Properties;

public class SystemCommands {
    public static void main(String[] args) {
        props();
        getProperties();
        getEnvVars();
    }

    public static void props() {
        Properties p = System.getProperties();
        p.list(System.out);

        String userName = System.getProperty("user.name");
        System.out.println("userName = " + userName);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator);

        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator2 = " + lineSeparator2);
    }

    public static void getProperties(){
        try {
            FileInputStream config = new FileInputStream("src/config.properties");
            Properties properties = new Properties(System.getProperties());
            properties.load(config);
            properties.setProperty("config.set.value", "THSMIT");

            System.setProperties(properties);
            Properties p = System.getProperties();
            p.list(System.out);
            System.out.println("System.getProperty(\"config.set.value\") = " + System.getProperty("config.set.value"));
        } catch (Exception e) {
            System.out.println("File does not exist = " + e);
        }

    }

    public static void getEnvVars(){
        Map<String, String> envVar = System.getenv();
        System.out.println("envVar = " + envVar);

        String username = System.getenv("USER");
        System.out.println("USER = " + username);

        String javaHome = System.getenv("HOME");
        System.out.println("HOME = " + javaHome);

        String temp = envVar.get("LOGNAME");
        System.out.println("LOGNAME = " + temp);

        String path = envVar.get("PATH");
        System.out.println("PATH = " + path);

        for(String key: envVar.keySet()) {
            System.out.println(key + " = " + envVar.get(key));
        }
    }
}
