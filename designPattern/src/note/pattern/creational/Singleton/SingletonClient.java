package note.pattern.creational.Singleton;

import note.pattern.creational.Singleton.sample.Singleton;

/**
 * Singleton �Ҧ��i�H�O�Ҥ@�����O�u���@�ӹ�ҡA�ô��Ѥ@�ӳX�ݡ]visit�^�o�ӹ�Ҫ���k�C
 * @author 635_kentsong
 */

public class SingletonClient {

	public static void main(String[] args) {
		
		System.out.println("*********************");
		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(Singleton.getInstance().hashCode());

	}

}
