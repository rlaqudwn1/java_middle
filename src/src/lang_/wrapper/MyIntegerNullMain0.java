package lang_.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {

        int[] inArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(inArr, -1));
        System.out.println(findValue(inArr, -0));
        System.out.println(findValue(inArr, 5));
        System.out.println(findValue(inArr, 4));

    }
    private static int findValue(int[] intArr, int target){
        for (int value : intArr) {
            if (value== target) {
                return value;
            }
        }
        return -1;
    }
}
