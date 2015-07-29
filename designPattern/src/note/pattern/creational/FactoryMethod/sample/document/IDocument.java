package note.pattern.creational.FactoryMethod.sample.document;

public interface IDocument {
	public void open();

	public void save();

	public void close();
	
	public void setTitle(String title);
}
