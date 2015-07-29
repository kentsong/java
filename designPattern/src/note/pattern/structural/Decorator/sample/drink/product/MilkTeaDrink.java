package note.pattern.structural.Decorator.sample.drink.product;

import java.util.ArrayList;

import note.pattern.structural.Decorator.sample.drink.AbstractDrink;
import note.pattern.structural.Decorator.sample.material.IMaterial;
import note.pattern.structural.Decorator.sample.material.Milk;
import note.pattern.structural.Decorator.sample.material.RedTea;

public class MilkTeaDrink extends AbstractDrink {

	public MilkTeaDrink(){
		//�ӫ~�W��
		this.prodName = "����";
		//��J����
		this.materials = new ArrayList<IMaterial>();
		materials.add(new RedTea());
		materials.add(new Milk());
		//�˹�
		this.decorate(materials);
		
	}
	
	
	
}
