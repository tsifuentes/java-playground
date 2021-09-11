public class CommandLineTest {
    public static void main(String[] args) {
        // javac class.java
        // java class params ....
        if(args.length == 0) {
            System.out.println("No arguments");
            System.exit(-1);
        }
        
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" +  i + "] = " + args[i]);
        }
    }
}
