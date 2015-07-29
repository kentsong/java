package note.pattern.creational.FactoryMethod.sample.editor;

import note.pattern.creational.FactoryMethod.sample.document.DocDocument;
import note.pattern.creational.FactoryMethod.sample.document.IDocument;

public class DocEditor extends Editor{

	public IDocument createDocument() {
		 return new DocDocument();
	}

}
