package stepDefiniation;

import core.Base;
import io.cucumber.java. *;

public class Initializer extends Base {
	
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario" + scenario.getName()+"Started");
		browser();
		openBrowser();
	}
	@After
	public void afterHooks(Scenario scenario) {
		tearDown();
		logger.info("Scenario"+scenario.getName()+""+scenario.getStatus());
	}

}
