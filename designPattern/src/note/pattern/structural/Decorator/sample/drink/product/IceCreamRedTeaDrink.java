package note.pattern.structural.Decorator.sample.drink.product;

import java.util.ArrayList;

import note.pattern.structural.Decorator.sample.drink.AbstractDrink;
import note.pattern.structural.Decorator.sample.material.IMaterial;
import note.pattern.structural.Decorator.sample.material.IceCream;
import note.pattern.structural.Decorator.sample.material.RedTea;

public class IceCreamRedTeaDrink extends AbstractDrink {

	public IceCreamRedTeaDrink(){
		//商品名稱
		this.prodName = "冰淇淋紅茶";
		//放入材料
		this.materials = new ArrayList<IMaterial>();
		materials.add(new RedTea());
		materials.add(new IceCream());
		//裝飾
		this.decorate(materials);
		
	}
}
