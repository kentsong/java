package note.pattern.creational.FactoryMethod.sample_2016.document;

public class TextDocument extends Document {

	@Override
	public void open() {
		 System.out.println("�}�Ҥ�r�ɮ� " + this.getTitle());
	}

	@Override
	public void save() {
		 System.out.println("�x�s��r�ɮ� " + this.getTitle());
	}

	@Override
	public void close() {
		 System.out.println("������r�ɮ� " + this.getTitle());
	}

}
