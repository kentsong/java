package note.pattern.structural.Facade;

import note.pattern.structural.Facade.sample.IComponent;
import note.pattern.structural.Facade.sample.component.FacebookComponent;
import note.pattern.structural.Facade.sample.component.GoogleComponent;

/**
 * 若系統需使用第三方api(或元件),釐出一個入口（Facade）介面，讓對程式庫的依賴實現在對介面的實作上
 * 如果應用程式直接使用了程式庫中所提供的各種API，也就是應用程式直接與程式庫有了高度耦合，
 * 將來程式庫異動，您的應用程式中與 該程式庫相關部份，都要一一找出修改，如果未來有更換程式庫的可能性，這種設計方式顯然地屆時必須作出大幅修改。
 * 
 * Facade模式隱藏了各個元件之間的合作行為，以及元件本身的操作與設定細節，固而必失去了一些直接操作元件的方便性，
 * 所以對於喜歡追求 與操作細節的程式設計人員而言，不會很喜歡透過Facade來操作背後的元件，所以您的Facade介面設計，通常要在元件依賴性及元件的支接操作性之間 作個平衡。
 * 
 * @author 635_kentsong
 */
public class FacadeClient {

	public static void main(String[] args) {
		
		IComponent googleComponent = new GoogleComponent();
		googleComponent.doService();
		
		IComponent facebookComponent = new FacebookComponent();
		facebookComponent.doService();
	}

}
