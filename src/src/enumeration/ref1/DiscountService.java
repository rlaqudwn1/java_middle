package enumeration.ref1;

//리팩토링
public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        return  price *classGrade.getDiscountPercent()/100;
    }
}
