package note.pattern.structural.Decorator;

import note.pattern.structural.Decorator.sample.drink.IDrink;
import note.pattern.structural.Decorator.sample.drink.product.IceCreamRedTeaDrink;
import note.pattern.structural.Decorator.sample.drink.product.MilkTeaDrink;

/**
 * 不採取繼承的方式，而以組合的方式動態地為物件添加功能 ，是Decorator模式的實現
 * @author 635_kentsong
 */

public class DecoratorClient {

	public static void main(String[] args) {
		// 範例:飲料店
		// 一個drink,由多個material組合而成,價格也因此不一樣

		IDrink drink = new MilkTeaDrink();
		System.out.println("點了:"+drink.getProdName());
		System.out.println("價格:"+drink.getPrice());
		
		IDrink drink2 = new IceCreamRedTeaDrink();
		System.out.println("點了:"+drink2.getProdName());
		System.out.println("價格:"+drink2.getPrice());
	}

}
