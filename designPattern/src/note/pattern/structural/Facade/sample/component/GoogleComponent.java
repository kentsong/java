package note.pattern.structural.Facade.sample.component;

import note.pattern.structural.Facade.sample.IComponent;
import note.pattern.structural.Facade.sample.api.GoogleThirdPartyApi;

public class GoogleComponent implements IComponent {

	@Override
	public void doService() {
		GoogleThirdPartyApi googleApi = new GoogleThirdPartyApi();
		googleApi.doGoogleApi();

	}

}
