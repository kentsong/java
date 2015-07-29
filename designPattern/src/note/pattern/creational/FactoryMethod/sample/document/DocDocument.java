package note.pattern.creational.FactoryMethod.sample.document;

public class DocDocument extends Document {

	public void open() {
		 System.out.println("開啟word檔案 " + this.getTitle());
	}

	public void save() {
		 System.out.println("儲存word檔案 " + this.getTitle());
	}

	public void close() {
		 System.out.println("關閉word檔案 " + this.getTitle());
	}

}
