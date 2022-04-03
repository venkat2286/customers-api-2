package com.deere.connectioninfo;

public class ConnectivityInformationDetails {

	public String targetName = null;
	public String target = null;
	public boolean result = false;

	public ConnectivityInformationDetails() {
	}

	public ConnectivityInformationDetails(String targetName, String target, boolean result) {
		this.targetName = targetName;
		this.target = target;
		this.result = result;
	}

	public String getTargetName() {
		return targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

}
