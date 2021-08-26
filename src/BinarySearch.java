
import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int list[] = SingletonUtil.orderedList;
        int findKeyMin = SingletonUtil.binarySearch(list, SingletonUtil.findKeyMin);
        System.out.println("findKeyMin index = " + findKeyMin);
        int findKeyMax = SingletonUtil.binarySearch(list, SingletonUtil.findKeyMax);
        System.out.println("findKeyMax index = " + findKeyMax);
        int notFoundKey = SingletonUtil.binarySearch(list, SingletonUtil.notFoundKey);
        System.out.println("notFoundKey index = " + notFoundKey);
    }
}
