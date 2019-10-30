package business;

public class WizardObjects {
	private String wizardObj;

	public WizardObjects() {
		super();
	}

	public WizardObjects(String wizardObj) {
		super();
		this.wizardObj = wizardObj;
	}

	public String getWizardObj() {
		return wizardObj;
	}

	public void setWizardObj(String wizardObj) {
		this.wizardObj = wizardObj;
	}

	@Override
	public String toString() {
		return wizardObj;
	}
	
	
	
}