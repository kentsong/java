package note.pattern.structural.Decorator.sample.drink;

import java.util.List;

import note.pattern.structural.Decorator.sample.material.IMaterial;

public abstract class AbstractDrink implements IDrink {
	
	protected int price;
	protected String prodName;
	protected List<IMaterial> materials;
	
	protected void decorate(List<IMaterial> materials){
		System.out.println("*****�}�l�s�@*****");
		for(IMaterial material : materials){
			System.out.println("�[�J����:"+material.getMaterialName());
			this.price += material.getMaterialPrice();
		}
		System.out.println("*****�s�@����*****");
	}
	
	
	public int getPrice() {
		return price;
	}

	public String getProdName() {
		return prodName;
	}

	public List<IMaterial> getMaterials() {
		return materials;
	}

	public void setMaterials(List<IMaterial> materials) {
		this.materials = materials;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	
	
	

}
