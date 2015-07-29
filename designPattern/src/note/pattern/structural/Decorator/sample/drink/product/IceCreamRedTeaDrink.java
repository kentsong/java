package note.pattern.structural.Decorator.sample.drink.product;

import java.util.ArrayList;

import note.pattern.structural.Decorator.sample.drink.AbstractDrink;
import note.pattern.structural.Decorator.sample.material.IMaterial;
import note.pattern.structural.Decorator.sample.material.IceCream;
import note.pattern.structural.Decorator.sample.material.RedTea;

public class IceCreamRedTeaDrink extends AbstractDrink {

	public IceCreamRedTeaDrink(){
		//�ӫ~�W��
		this.prodName = "�B�N�O����";
		//��J����
		this.materials = new ArrayList<IMaterial>();
		materials.add(new RedTea());
		materials.add(new IceCream());
		//�˹�
		this.decorate(materials);
		
	}
}
