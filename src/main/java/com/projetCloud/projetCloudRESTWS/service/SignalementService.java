package com.projetCloud.projetCloudRESTWS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetCloud.projetCloudRESTWS.model.Signalement;
import com.projetCloud.projetCloudRESTWS.repository.SignalementRepository;

@Service
public class SignalementService {
	
	@Autowired
	private SignalementRepository signalementRepository;
	
	public List<Signalement> getSignalements(){
		return signalementRepository.findAll();
	}
	
	public Optional<Signalement> getSignalement(final Long id){
		return signalementRepository.findById(id);
	}
	
	public Signalement saveSignalement(Signalement signalement) {
		Signalement savedSignalement = signalementRepository.save(signalement);
		return savedSignalement;
	}
	
	public Signalement updateSignalement(final Long id,Signalement signalement) {
		Optional<Signalement> signal = signalementRepository.findById(id);
		Signalement updatedSignalement = null;
		if(signal.isPresent()) {
			Signalement currentSignal = signal.get();
			Long idUtilisateur = signalement.getIdUtilisateur();
			Long idType = signalement.getIdType();
			Long idRegion = signalement.getIdRegion();
			Long idStatus = signalement.getIdStatus();
			String dateSignalement = signalement.getDateSignalement();
			String image = signalement.getImage();
			Double latitude = signalement.getLatitude();
			Double longitude = signalement.getLongitude();
			if(idUtilisateur != null)
				currentSignal.setIdUtilisateur(idUtilisateur);
			if(idType != null)
				currentSignal.setIdType(idType);
			if(idRegion != null)
				currentSignal.setIdRegion(idRegion);
			if(idStatus != null)
				currentSignal.setIdStatus(idStatus);
			if(dateSignalement != null)
				currentSignal.setDateSignalement(dateSignalement);
			if(image != null)
				currentSignal.setImage(image);
			if(latitude !=null)
				currentSignal.setLatitude(latitude);
			if(longitude != null)
				currentSignal.setLongitude(longitude);
			updatedSignalement = signalementRepository.save(currentSignal);
		}
		return updatedSignalement;
	}
}
