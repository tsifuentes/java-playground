import java.util.ArrayList;

public class Student extends Persona implements IStudent{

    ArrayList<String> students = new ArrayList<>();

    public Student(){}

    public Student(String name){
        add(name);
        super.name = name;
    }

    @Override
    public void add(String name){
        this.students.add(name);
    }

    @Override
    public void update(int index, String name) {
        students.add(index, name);
    }

    @Override
    public void delete(int index) {
        students.remove(index);
    }

    @Override
    public ArrayList<String> list() {
        return students;
    }

    @Override
    public String get(int index) {
        return students.get(index);
    }

}
