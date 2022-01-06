package com.projetCloud.projetCloudRESTWS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetCloud.projetCloudRESTWS.model.Signalement;
import com.projetCloud.projetCloudRESTWS.service.SignalementService;

@RestController
public class SignalementController {
	
	@Autowired
	private SignalementService signalService;
	
	@PostMapping("/signalements")
	public Signalement createSignalement(@RequestBody Signalement signalement) {
		return signalService.saveSignalement(signalement);
	}
}
