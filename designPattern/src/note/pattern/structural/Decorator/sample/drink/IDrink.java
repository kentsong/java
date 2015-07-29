package note.pattern.structural.Decorator.sample.drink;

import java.util.List;

import note.pattern.structural.Decorator.sample.material.IMaterial;

public interface IDrink {

	public int getPrice(); //價格
	public String getProdName(); //飲料名稱
	public List<IMaterial> getMaterials(); //材料
}
