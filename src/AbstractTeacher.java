import java.util.ArrayList;

public abstract class AbstractTeacher {
    String name;
    protected String lastName;
    private String age;
    public String address;
    ArrayList<String> teachers = new ArrayList<>();
    public abstract String get(int index);
    public void add(String name){
        teachers.add(name);
    }
}
