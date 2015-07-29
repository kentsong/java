package note.pattern.creational.Singleton;

import note.pattern.creational.Singleton.sample.Singleton;

/**
 * Singleton 模式可以保證一個類別只有一個實例，並提供一個訪問（visit）這個實例的方法。
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
