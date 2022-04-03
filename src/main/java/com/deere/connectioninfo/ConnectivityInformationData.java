package com.deere.connectioninfo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConnectivityInformationData {

	public String messageName = null;
	public String serviceInstance = null;
	public String trackingID = null;

	public ArrayList<ConnectivityInformationDetails> connectivityInformationDetails;

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public String getServiceInstance() {
		return serviceInstance;
	}

	public void setServiceInstance(String serviceInstance) {
		this.serviceInstance = serviceInstance;
	}

	public String getTrackingID() {
		return trackingID;
	}

	public void setTrackingID(String trackingID) {
		this.trackingID = trackingID;
	}

	public ArrayList<ConnectivityInformationDetails> getConnectivityInformationDetails() {
		return connectivityInformationDetails;
	}

	public void setConnectivityInformationDetails(ArrayList<ConnectivityInformationDetails> connectivityInformationDetails) {
		this.connectivityInformationDetails = connectivityInformationDetails;
	}
}
