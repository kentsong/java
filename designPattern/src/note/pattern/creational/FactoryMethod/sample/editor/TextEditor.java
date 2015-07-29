package note.pattern.creational.FactoryMethod.sample.editor;

import note.pattern.creational.FactoryMethod.sample.document.IDocument;
import note.pattern.creational.FactoryMethod.sample.document.TextDocument;

public class TextEditor extends Editor{

	public IDocument createDocument() {
        return new TextDocument();
    }
}
