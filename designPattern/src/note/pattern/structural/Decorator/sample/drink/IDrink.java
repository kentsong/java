package note.pattern.structural.Decorator.sample.drink;

import java.util.List;

import note.pattern.structural.Decorator.sample.material.IMaterial;

public interface IDrink {

	public int getPrice(); //����
	public String getProdName(); //���ƦW��
	public List<IMaterial> getMaterials(); //����
}
