package note.pattern.structural.Decorator.sample.drink.product;

import java.util.ArrayList;

import note.pattern.structural.Decorator.sample.drink.AbstractDrink;
import note.pattern.structural.Decorator.sample.material.IMaterial;
import note.pattern.structural.Decorator.sample.material.Milk;
import note.pattern.structural.Decorator.sample.material.RedTea;

public class MilkTeaDrink extends AbstractDrink {

	public MilkTeaDrink(){
		//商品名稱
		this.prodName = "奶茶";
		//放入材料
		this.materials = new ArrayList<IMaterial>();
		materials.add(new RedTea());
		materials.add(new Milk());
		//裝飾
		this.decorate(materials);
		
	}
	
	
	
}
