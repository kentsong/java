package note.pattern.creational.FactoryMethod.sample_2016.editor;

import note.pattern.creational.FactoryMethod.sample_2016.document.DocDocument;
import note.pattern.creational.FactoryMethod.sample_2016.document.IDocument;

public class DocEditor extends Editor{

	public IDocument createDocument() {
		 return new DocDocument();
	}

}
