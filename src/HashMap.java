
import java.util.Arrays;

public class HashMap {
    public static void main(String args[])
    {
        HashMap hashMap = new HashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(3));
        hashMap.put(2, 1);
        System.out.println(hashMap.get(2));
        hashMap.remove(2);
        System.out.println(hashMap.get(2));
    }

    int[] array = new int[1000001];
    
    public HashMap(){
        Arrays.fill(array, -1);
    }

    private void put(int key, int value) {
        array[key] = value;
    }

    private int get(int key) {
        return array[key];
    }

    private void remove(int key) {
        array[key] = -1;
    }
}
