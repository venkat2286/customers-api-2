package com.deere.connectioninfo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;


@Service("ConnectivityInformationServiceImpl")
public class ConnectivityInformationServiceImpl implements ConnectivityInformationService {


    public ConnectivityInformationData setConnectivityInformationData() {

        ConnectivityInformationData connectivityInformationData = new ConnectivityInformationData();
        connectivityInformationData.setMessageName("connectivityInformation");
        connectivityInformationData.setServiceInstance("windchilldev");
        connectivityInformationData.setTrackingID("adbb4aa0cc355c1258215245a438b4d5");
        ArrayList<ConnectivityInformationDetails> connectivityInformationDetails = new ArrayList<>();
        connectivityInformationDetails.add(new ConnectivityInformationDetails("SAP AG MESSAGE BROKER", "https://ebambdev.tal.deere.com/corp/pdmlink/ag/release", false));
        connectivityInformationDetails.add(new ConnectivityInformationDetails("SAP AA MESSAGE BROKER", "https://ebambdev.tal.deere.com/corp/pdmlink/ag/release", false));
        connectivityInformationDetails.add(new ConnectivityInformationDetails("SAP A2 MESSAGE BROKER", "https://ebambdev.tal.deere.com/corp/pdmlink/ag/release", false));
        connectivityInformationDetails.add(new ConnectivityInformationDetails("SAP AG PI", "http://picpc.dx.deere.com/XISOAPAdapter/MessageServlet?senderParty=&senderService=PDMLink&interface=ECNSearchDetailsSyncOutbound&interfaceNamespace=http://deere.com/xi/ijdpdm", true));
        connectivityInformationDetails.add(new ConnectivityInformationDetails("AWS IPC", "https://ao2oy7amve.execute-api.us-east-1.amazonaws.com/ipc-copy-reference-part/test", true));
        connectivityInformationData.setConnectivityInformationDetails(connectivityInformationDetails);
        return connectivityInformationData;
    }


    public ConnectivityInformationData getConnectivityInformationById(String targetName) {
        ConnectivityInformationData connectivityInformationData = setConnectivityInformationData();
        ArrayList<ConnectivityInformationDetails> connectivityInformationDetails = connectivityInformationData.getConnectivityInformationDetails();
        ArrayList<ConnectivityInformationDetails> searchedList = (ArrayList<ConnectivityInformationDetails>) connectivityInformationDetails.stream().filter(c -> c.targetName.equals(targetName)).collect(Collectors.toList());
        connectivityInformationData.setConnectivityInformationDetails(searchedList);
        return connectivityInformationData;
    }


}

