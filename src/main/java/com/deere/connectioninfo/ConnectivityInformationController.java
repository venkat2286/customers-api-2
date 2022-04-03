package com.deere.connectioninfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController("ConnectivityInformationController")
public class ConnectivityInformationController {

	@Autowired
	ConnectivityInformationService connectivityInformationService;


	@GetMapping(value = "/deere/anonymous/rest/getConnectivityInformation")
	@CrossOrigin(origins = "*")
	public ResponseEntity<ConnectivityInformationData> getConnectivityInformation() {
		return ResponseEntity.ok(connectivityInformationService.setConnectivityInformationData());
	}
	@GetMapping(value = "/deere/anonymous/rest/getConnectivityInformationForTarget")
	@CrossOrigin(origins = "*")
	public ResponseEntity<ConnectivityInformationData> getConnectivityInformationById(@RequestParam(required = true) String targetName) {
      ;
	   return ResponseEntity.ok(connectivityInformationService.getConnectivityInformationById(targetName));
	}
}
