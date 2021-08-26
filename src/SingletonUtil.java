
public class SingletonUtil {
    public static double total;
    public static double sum(double amount, double factor){
        return total = amount + factor;
    }
    public static int orderedList[] = {1,3,5,7,9,11,13,15,16,18};
    // 0,1,2,3,4,5,6,7,8,9
    public static int findKeyMin = 1;
    public static int findKeyMax = 18;
    public static int notFoundKey = 10;

    public static int binarySearch(int orderedList[], int key){
        int keyIndex = -1;
        int start = 0;
        int end = orderedList.length - 1;

        while (start <= end){
            int mid = (end - start)/2 + start;
            if (orderedList[mid] < key) {
                start = mid + 1;
            } else if (orderedList[mid] > key) {
                end = mid - 1;
            } else if(orderedList[mid] == key) {
                keyIndex = mid;
                break;
            }
        }

        return keyIndex;
    }
}
