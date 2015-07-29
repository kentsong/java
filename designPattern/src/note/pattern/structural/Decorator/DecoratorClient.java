package note.pattern.structural.Decorator;

import note.pattern.structural.Decorator.sample.drink.IDrink;
import note.pattern.structural.Decorator.sample.drink.product.IceCreamRedTeaDrink;
import note.pattern.structural.Decorator.sample.drink.product.MilkTeaDrink;

/**
 * ���Ĩ��~�Ӫ��覡�A�ӥH�զX���覡�ʺA�a������K�[�\�� �A�ODecorator�Ҧ�����{
 * @author 635_kentsong
 */

public class DecoratorClient {

	public static void main(String[] args) {
		// �d��:���Ʃ�
		// �@��drink,�Ѧh��material�զX�Ӧ�,����]�]�����@��

		IDrink drink = new MilkTeaDrink();
		System.out.println("�I�F:"+drink.getProdName());
		System.out.println("����:"+drink.getPrice());
		
		IDrink drink2 = new IceCreamRedTeaDrink();
		System.out.println("�I�F:"+drink2.getProdName());
		System.out.println("����:"+drink2.getPrice());
	}

}
