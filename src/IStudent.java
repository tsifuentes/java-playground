import java.util.ArrayList;

public interface IStudent {
    void add(String name);
    void update(int index, String name);
    void delete(int index);
    ArrayList<String> list();
    String get(int index);
}
