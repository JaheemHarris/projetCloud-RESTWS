package com.projetCloud.projetCloudRESTWS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetCloud.projetCloudRESTWS.model.Signalement;
import com.projetCloud.projetCloudRESTWS.service.SignalementService;

@RestController
@RequestMapping("/api/v1")
public class SignalementController {
	
	@Autowired
	private SignalementService signalService;
	
	@PostMapping("/signalements")
	public Signalement createSignalement(@RequestBody Signalement signalement) {
		return signalService.saveSignalement(signalement);
	}
	
	@GetMapping("/signalements")
	public List<Signalement> getSignalements(){
		return signalService.getSignalements();
	}
	
	@GetMapping("/signalements/{id}")
	public Signalement getSignalement(@PathVariable("id") final Long id) {
		Optional<Signalement> optSignal = signalService.getSignalement(id);
		Signalement signalement = null;
		if(optSignal.isPresent())
			signalement = optSignal.get();
		return signalement;
	}
	
	@PutMapping("/signalements/{id}")
	public Signalement updateSignalement(@PathVariable("id") final Long id,@RequestBody Signalement signalement) {
		Signalement updatedSignalement = signalService.updateSignalement(id, signalement);
		return updatedSignalement;
	}
	
	@DeleteMapping("/signalements/{id}")
	public void deleteSignalement(@PathVariable("id") final Long id) {
		signalService.deleteSignalement(id);
	}
}
