package note.pattern.structural.Facade.sample.component;

import note.pattern.structural.Facade.sample.IComponent;
import note.pattern.structural.Facade.sample.api.FacebookThirdPartyApi;

public class FacebookComponent implements IComponent {

	public void doService() {
		FacebookThirdPartyApi facebookApi = new FacebookThirdPartyApi();
		facebookApi.doFacebookApi();

	}

}
