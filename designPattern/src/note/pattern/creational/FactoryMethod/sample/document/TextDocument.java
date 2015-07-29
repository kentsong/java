package note.pattern.creational.FactoryMethod.sample.document;

public class TextDocument extends Document {

	@Override
	public void open() {
		 System.out.println("開啟文字檔案 " + this.getTitle());
	}

	@Override
	public void save() {
		 System.out.println("儲存文字檔案 " + this.getTitle());
	}

	@Override
	public void close() {
		 System.out.println("關閉文字檔案 " + this.getTitle());
	}

}
