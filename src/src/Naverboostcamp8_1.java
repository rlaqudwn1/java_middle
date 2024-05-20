//public class Naverboostcamp8_1 {
//
//    /**
//     *   1.자료형에 따라 byte를 나눈다.
//     *   2. Bool+ a 에 대한 패딩을 쓰는 예외처리.
//     *   3. 8개의 바이트계산과 남은 바이트의 패딩처리.
//     *   4. 128바이트를 초과하였는가에 대한 처리.
//      */
//
//    enum BYTE {
//        BOOL(1), SHORT(2), FLOAT(4), INT(8), LONG(16),
//        ;
//
//        BYTE(int i) {
//        }
//    }
//    public static void main(String[] args) {
//        int count=8;
//
//        BYTE Byte;
//        String[] arr = {"INT", "INT", "BOOL", "SHORT", "LONG"};
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0) {
//                switch (Byte) {
//                    case BOOL -> System.out.print("#");
//                    case SHORT -> System.out.print("##");
//                    case FLOAT -> System.out.println("####");
//                    case INT -> System.out.println("########");
//                    case LONG -> System.out.println("########,########");
//                }
//            }
//        }
//
//    }
//
//
//}
