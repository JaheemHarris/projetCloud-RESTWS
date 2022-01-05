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
import org.springframework.web.bind.annotation.RestController;

import com.projetCloud.projetCloudRESTWS.model.TypeSignalement;
import com.projetCloud.projetCloudRESTWS.service.TypeSignalementService;

@RestController
public class TypeSignalementController {
	
	@Autowired
	private TypeSignalementService typeService;
	
	@GetMapping("/typesignalements")
	public List<TypeSignalement> getTypeSignalements(){
		return typeService.getTypeSignalement();
	}
	
	@GetMapping("/typesignalements/{id}")
	public TypeSignalement getTypeSignalement(@PathVariable("id") final Long id) {
		Optional<TypeSignalement> optType = typeService.getTypeSignalement(id);
		TypeSignalement type = null;
		if(optType.isPresent())
			type = optType.get();
		return type;
	}
	
	@PostMapping("/typesignalements")
	public TypeSignalement saveTypeSignalement(@RequestBody TypeSignalement type) {
		return typeService.saveType(type);
	}
	
	@DeleteMapping("/typesignalements/{id}")
	public void deleteTypeSignalement(@PathVariable("id") final Long id) {
		typeService.deleteType(id);
	}
	
	@PutMapping("/typesignalements/{id}")
	public TypeSignalement updateTypeSignalement(@PathVariable("id") final Long id,@RequestBody TypeSignalement type) {
		TypeSignalement updatedType = typeService.updateType(id, type);
		return updatedType;
	}
}
