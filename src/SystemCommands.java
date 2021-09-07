import java.util.Properties;

public class SystemCommands {
    public static void main(String[] args) {
        props();
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
}
