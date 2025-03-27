package ex09package;

import ex09package.study.buyer.FruitBuyer4;
import ex09package.study.seller.FruitSeller4;

public class E03FruitSalesMain4 {

	public static void main(String[] args) {
		// 판매자1 : 사과100개, 단가 1000원
		FruitSeller4 seller1 = new FruitSeller4( 0, 100, 1000 );
		
		// 판매자2 : 사과 80개, 단가 500원
		FruitSeller4 seller2 = new FruitSeller4( 0, 80, 500 );
		
		// 구매자 : 보유금액 10000원
		FruitBuyer4 buyer = new FruitBuyer4( 10000, 0 );
		
		System.out.println("=구매행위가 일어나기 전의 상태=");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//각각의 판매자에게 5000원씩 지불한 후 사과 구매
		buyer.buyApple( seller1, 5000 );
		buyer.buyApple( seller2, 5000 );
		
		System.out.println("=구매행위가 일어난 후의 상태=");
		seller1.showSaleResult();
		seller2.showSaleResult();
		
		//10000원을 내고 15개를 구매한다.
		buyer.showBuyResult();
	}
}
