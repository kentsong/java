package note.pattern.creational.FactoryMethod.sample.editor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import note.pattern.creational.FactoryMethod.sample.document.IDocument;

public abstract class Editor {
	private List<IDocument> docs = new ArrayList<IDocument>();

	public IDocument open(String file) {
		IDocument doc = createDocument();
		doc.setTitle(file);
		doc.open();
		docs.add(doc);
		
		return doc;
	}

	public void save(IDocument doc) {
		doc.save();
	}

	public void close(IDocument doc) {
		doc.close();
		docs.remove(doc);
	}

	public void close() {
		Iterator<IDocument> it = docs.iterator();
		while(it.hasNext()){
			IDocument doc = it.next();
			doc.close();
			it.remove();
		}
	}

	// ... 其它的方法定義
	abstract IDocument createDocument(); // Factory method
}
