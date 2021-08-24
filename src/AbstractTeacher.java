import java.util.ArrayList;

public abstract class AbstractTeacher {
    ArrayList<String> teachers = new ArrayList<>();
    public abstract String get(int index);
    public void add(String name){
        teachers.add(name);
    }
}
