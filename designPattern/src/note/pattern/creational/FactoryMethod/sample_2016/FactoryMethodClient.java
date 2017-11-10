package note.pattern.creational.FactoryMethod.sample_2016;

import note.pattern.creational.FactoryMethod.sample_2016.document.IDocument;
import note.pattern.creational.FactoryMethod.sample_2016.editor.DocEditor;
import note.pattern.creational.FactoryMethod.sample_2016.editor.Editor;
import note.pattern.creational.FactoryMethod.sample_2016.editor.TextEditor;

/**
 * 如果您希望如何建立父類別中用到的物件這件事，是由子類別來決定，可以使用 Factory Method。
 * 
 * 假設您要完成一個文件編輯器，您希望這個編輯器可以適用於所有類型的檔案編輯，例如RTF、DOC、TXT等等，
 * 儘管這些文件有著不同的格 式，您先確定的是這些文件必然具備的一些操作介面，例如儲存、開啟、關閉等，您用一個Document類型來進行操作，
 * 這麼一來這個框架就無需考慮實 際的儲存、開啟等細節是如何進行的。
 * @author 635_kentsong
 */

public class FactoryMethodClient {

	public static void main(String[] args) {
		
		System.out.println("*****************************");
		System.out.println("#檔案編輯器選擇,由子類別決定");
		//依據前端的附檔名,使用對應的編輯器開啟檔案
		//Editor editor = new TextEditor();
		Editor editor = new DocEditor();
		IDocument main1 = editor.open("Main.java");
		editor.save(main1);
		
		editor.open("Editor.java");
		
		editor.close();

	}

}
