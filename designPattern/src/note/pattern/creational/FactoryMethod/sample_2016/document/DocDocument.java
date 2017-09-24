package note.pattern.creational.FactoryMethod.sample_2016.document;

public class DocDocument extends Document {

	public void open() {
		 System.out.println("�}��word�ɮ� " + this.getTitle());
	}

	public void save() {
		 System.out.println("�x�sword�ɮ� " + this.getTitle());
	}

	public void close() {
		 System.out.println("����word�ɮ� " + this.getTitle());
	}

}
