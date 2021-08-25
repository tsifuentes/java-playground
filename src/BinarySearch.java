
import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int list[] = SingletonUtil.orderedList;
        int key = SingletonUtil.findKey;
        int result = -1;
        int low = 0;
        int high = list.length - 1;
        // 1 .... 10 = 5 -> 1 + (10 - 1) / 2
        while( low <= high){
            int mid = low + ((high - low) / 2);
            if(list[mid] < key) {
                low = mid + 1;
            } else if (list[mid] > key) {
                high = mid - 1;
            } else if(list[mid] == key) {
                result = mid;
                break;
            }
        }
        System.out.println("result = " + result);
    }
}
