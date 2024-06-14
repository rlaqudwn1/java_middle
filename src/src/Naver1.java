import java.util.HashMap;
import java.util.ArrayList;

public class Naver1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] arr = {3,5,7,9,1};
        ArrayList<Integer> array= new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else hashMap.put(arr[i],1);
        }
        for (Integer i : hashMap.keySet()) {
            if (hashMap.get(i) >= 2) {
                array.add(i);
            }
        }
        if (array.isEmpty()){
            System.out.println(-1);
        }else System.out.println(array);
    }
}
