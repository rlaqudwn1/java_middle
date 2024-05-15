import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Naverboostcamp8 {
    public static void main(String[] args) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] arr = {3,2, 4, 4,5, 2, 5, 2, 5};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(Integer.toString(arr[i]))) {

                hashMap.put(Integer.toString(arr[i]), hashMap.get(Integer.toString(arr[i])) + 1);
            } else {
                hashMap.put(Integer.toString(arr[i]), 1);
            }
        }

        for (Integer value : hashMap.values()) {
            if (value >= 2) {
                answer.add(value);
            }
        }
        System.out.println(answer);

    }
}
