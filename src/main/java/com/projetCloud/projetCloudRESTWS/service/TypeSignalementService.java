package com.projetCloud.projetCloudRESTWS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetCloud.projetCloudRESTWS.model.TypeSignalement;
import com.projetCloud.projetCloudRESTWS.repository.TypeSignalementRepo;


@Service
public class TypeSignalementService {
	
	@Autowired
	private TypeSignalementRepo typeRepo;
	
	public List<TypeSignalement> getTypeSignalement(){
		return typeRepo.findAll();
	}
	
	public Optional<TypeSignalement> getTypeSignalement(final Long id){
		return typeRepo.findById(id);
	}
	
	public TypeSignalement saveType(TypeSignalement type) {
		TypeSignalement savedType = typeRepo.save(type);
		return savedType;
	}
	
	public void deleteType(final Long id) {
		typeRepo.deleteById(id);
	}
	
	public TypeSignalement updateType(final Long id,TypeSignalement type) {
		TypeSignalement updatedType = null;
		Optional<TypeSignalement> optType = this.getTypeSignalement(id);
		if(optType.isPresent()) {
			TypeSignalement currentSignalement = optType.get();
			String typeSignalement = type.getType();
			if(typeSignalement != null)
				currentSignalement.setType(typeSignalement);
			updatedType = this.saveType(currentSignalement);
		}
		return updatedType;
	}
}
