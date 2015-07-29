package note.pattern.creational.FactoryMethod;

import note.pattern.creational.FactoryMethod.sample.document.IDocument;
import note.pattern.creational.FactoryMethod.sample.editor.DocEditor;
import note.pattern.creational.FactoryMethod.sample.editor.Editor;
import note.pattern.creational.FactoryMethod.sample.editor.TextEditor;

/**
 * �p�G�z�Ʊ�p��إߤ����O���Ψ쪺����o��ơA�O�Ѥl���O�ӨM�w�A�i�H�ϥ� Factory Method�C
 * 
 * ���]�z�n�����@�Ӥ��s�边�A�z�Ʊ�o�ӽs�边�i�H�A�Ω�Ҧ��������ɮ׽s��A�ҦpRTF�BDOC�BTXT�����A
 * ���޳o�Ǥ�󦳵ۤ��P���� ���A�z���T�w���O�o�Ǥ�󥲵M��ƪ��@�Ǿާ@�����A�Ҧp�x�s�B�}�ҡB�������A�z�Τ@��Document�����Ӷi��ާ@�A
 * �o��@�ӳo�Ӯج[�N�L�ݦҼ{�� �ڪ��x�s�B�}�ҵ��Ӹ`�O�p��i�檺�C
 * @author 635_kentsong
 */

public class FactoryMethodClient {

	public static void main(String[] args) {
		
		System.out.println("*****************************");
		System.out.println("#�ɮ׽s�边���,�Ѥl���O�M�w");
		//�̾ګe�ݪ����ɦW,�ϥι������s�边�}���ɮ�
		//Editor editor = new TextEditor();
		Editor editor = new DocEditor();
		IDocument main1 = editor.open("Main.java");
		editor.save(main1);
		
		editor.open("Editor.java");
		
		editor.close();

	}

}
