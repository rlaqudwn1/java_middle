package enumeration.ex3;


import static enumeration.ex3.Grade.*;  //enum은 상수이므로 import static을 사용하여 코드를 간결하게 작성할 수 있다.


public class DiscountService {
    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;
        if (classGrade== BASIC) {
            discountPercent = 10;
        } else if (classGrade== GOLD) {
            discountPercent=20;
            
        } else if (classGrade== DIAMOND) {
            discountPercent = 30;

        }
        else {
            System.out.println(classGrade+":Discount X");
        }
        return price*discountPercent/100;
    }
}
