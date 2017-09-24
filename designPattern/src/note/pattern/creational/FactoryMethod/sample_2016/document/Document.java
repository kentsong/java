package note.pattern.creational.FactoryMethod.sample_2016.document;

public abstract class Document implements IDocument{
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract void open();
    public abstract void save();
    public abstract void close();
	
}
