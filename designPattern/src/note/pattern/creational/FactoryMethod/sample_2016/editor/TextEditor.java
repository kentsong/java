package note.pattern.creational.FactoryMethod.sample_2016.editor;

import note.pattern.creational.FactoryMethod.sample_2016.document.IDocument;
import note.pattern.creational.FactoryMethod.sample_2016.document.TextDocument;

public class TextEditor extends Editor{

	public IDocument createDocument() {
        return new TextDocument();
    }
}
