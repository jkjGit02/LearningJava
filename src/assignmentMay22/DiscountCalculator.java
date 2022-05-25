package assignmentMay22;

public class DiscountCalculator {

	public static void main(String[] args) {
		double retailPrice=49.99;
		double discountedPrice=0;
		
		double flatDiscount=0.5;
		double promoCodeDiscount=0;
		
		String promoCode="Promo10";
		
		if(promoCode=="none") {
			discountedPrice=retailPrice*flatDiscount;
		}else if(promoCode=="Promo5") {
			discountedPrice=retailPrice*(flatDiscount+.05);
		}else if(promoCode=="Promo10") {
			discountedPrice=retailPrice*(flatDiscount+.1);
		}else if(promoCode=="Promo20") {
			discountedPrice=retailPrice*(flatDiscount+.2);
		}
System.out.println("Final discounted value="+discountedPrice);
	}

}
