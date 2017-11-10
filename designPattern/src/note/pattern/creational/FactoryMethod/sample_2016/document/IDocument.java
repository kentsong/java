package note.pattern.creational.FactoryMethod.sample_2016.document;

public interface IDocument {
	public void open();

	public void save();

	public void close();
	
	public void setTitle(String title);
}
