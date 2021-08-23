import java.util.ArrayList;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo desde Java");
        Student student = new Student();
        student.add("Thomas Sifuentes");
        System.out.println("student.get(0) = " + student.get(0));
        student.update(0, "Israel Martinez");
        System.out.println("student.get(0) = " + student.get(0));
        ArrayList<String> students = student.list();
        System.out.println("students = " + students);
        student.delete(0);
        System.out.println("students = " + students);
    }
}
