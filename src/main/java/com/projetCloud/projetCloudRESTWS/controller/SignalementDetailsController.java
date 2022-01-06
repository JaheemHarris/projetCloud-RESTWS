package com.projetCloud.projetCloudRESTWS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projetCloud.projetCloudRESTWS.model.SignalementDetails;
import com.projetCloud.projetCloudRESTWS.service.SignalementsDetailsService;

@RestController
@RequestMapping("/api/v1")
public class SignalementDetailsController {
	
	@Autowired
	private SignalementsDetailsService signalDetailsService;
	
	@RequestMapping(value="/signalementdetails",method=RequestMethod.GET)
	public List<SignalementDetails> getSignalementDetails(){
		return signalDetailsService.getSignalementDetails();
	}
	
	@RequestMapping(value="/signalementdetails/{id}",method=RequestMethod.GET)
	public SignalementDetails getSignalementDetails(@PathVariable("id") final Long id){
		Optional<SignalementDetails> optSignalementDetails = signalDetailsService.getSignalementDetails(id);
		SignalementDetails signalDetails = null;
		if(optSignalementDetails.isPresent())
			signalDetails = optSignalementDetails.get();
		return signalDetails;
	}
	
	@RequestMapping(value="/signalementdetails",params="user",method=RequestMethod.GET)
	public List<SignalementDetails> getSignalementDetailsByUser(@RequestParam(name="user") final Long idUser){
		return signalDetailsService.getSignalementUtilisateur(idUser);
	}
	
	@RequestMapping(value="/signalementdetails",params= {"user","region"},method=RequestMethod.GET)
	public List<SignalementDetails> getSignalementDetailsByUserAndRegion(@RequestParam(name="user") final Long idUser,@RequestParam(name="region") final Long idRegion){
		return signalDetailsService.getSignalementByUserInRegion(idUser, idRegion);
	}
	
	@RequestMapping(value="/signalementdetails",params= {"user","type"},method=RequestMethod.GET)
	public List<SignalementDetails> getSignalementDetailsByUserAndType(@RequestParam(name="user") final Long idUser,@RequestParam(name="type") final Long idType){
		return signalDetailsService.getSignalementByUserAndType(idUser, idType);
	}
	
	@RequestMapping(value="/signalementdetails",params= {"user","status"},method=RequestMethod.GET)
	public List<SignalementDetails> getSignalementDetailsByUserAndStatus(@RequestParam(name="user") final Long idUser,@RequestParam(name="status") final Long idStatus){
		return signalDetailsService.getSignalementByUserAndType(idUser, idStatus);
	}
	
	@RequestMapping(value="/signalementdetails",params= {"user","dateDebut","dateFin"},method=RequestMethod.GET)
	public List<SignalementDetails> getSignalementDetailsByUserBetween(@RequestParam(name="user") final Long idUser,@RequestParam(name="dateDebut") String dateDebut,@RequestParam(name="dateFin") String dateFin){
		return signalDetailsService.getSignalementByUserBetween(idUser, dateDebut, dateFin);
	}
	
	@RequestMapping(value="/signalementdetails",params= {"region"},method=RequestMethod.GET)
	public List<SignalementDetails> getSignalementDetailsByRegion(@RequestParam(name="region") final Long idRegion){
		return signalDetailsService.getSignalementsDetailsByRegion(idRegion);
	}
	
	@RequestMapping(value="/signalementdetails",params= {"type"},method=RequestMethod.GET)
	public List<SignalementDetails> getSignalementDetailsByType(@RequestParam(name="type") final Long idType){
		return signalDetailsService.getSignalementDetailsByType(idType);
	}
	
	@RequestMapping(value="/signalementdetails",params= {"status"},method=RequestMethod.GET)
	public List<SignalementDetails> getSignalementDetailsByStatus(@RequestParam(name="status") final Long idStatus){
		return signalDetailsService.getSignalementDetailsByStatus(idStatus);
	}
	
	@RequestMapping(value="/signalementdetails",params= {"dateDebut","dateFin"},method=RequestMethod.GET)
	public List<SignalementDetails> getSignalementDetailsBetween(@RequestParam(name="dateDebut") String dateDebut,@RequestParam(name="dateFin") String dateFin){
		return signalDetailsService.getSignalementDetailsBetween(dateDebut, dateFin);
	}
	
	
}
