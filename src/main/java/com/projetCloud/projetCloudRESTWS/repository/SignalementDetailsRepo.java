package com.projetCloud.projetCloudRESTWS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projetCloud.projetCloudRESTWS.model.SignalementDetails;

@Repository
public interface SignalementDetailsRepo extends JpaRepository<SignalementDetails,Long>{
	
	@Query(value="SELECT * FROM view_signalementDetails WHERE idRegion = ?1",nativeQuery=true)
	List<SignalementDetails> findByRegion(final Long idRegion);
	
	@Query(value="SELECT * FROM view_signalementDetails WHERE idUtilisateur = ?1",nativeQuery=true)
	List<SignalementDetails> findByUser(final Long idUtilisateur);
	
	@Query(value="SELECT * FROM view_signalementDetails WHERE idUtilisateur = ?1 AND idRegion = ?2",nativeQuery=true)
	List<SignalementDetails> findByUserAndRegion(final Long idUtilisateur,final Long idRegion);
	
	@Query(value="SELECT * FROM view_signalementDetails WHERE idType = ?1",nativeQuery=true)
	List<SignalementDetails> findByType(final Long idType);
	
	@Query(value="SELECT * FROM view_signalementDetails WHERE idUtilisateur = ?1 AND idType = ?2",nativeQuery=true)
	List<SignalementDetails> findByUserAndType(final Long idUtilisateur,final Long idType);
	
	@Query(value="SELECT * FROM view_signalementDetails WHERE idStatus = ?1",nativeQuery=true)
	List<SignalementDetails> findByStatus(final Long idStatus);
	
	@Query(value="SELECT * FROM view_signalementDetails WHERE idUtilisateur = ?1 AND idStatus = ?2",nativeQuery=true)
	List<SignalementDetails> findByUserAndStatus(final Long idUtilisateur,final Long idStatus);
	
	@Query(value="SELECT * FROM view_signalementDetails WHERE dateSignalement > ?1 AND dateSignalement < ?2",nativeQuery=true)
	List<SignalementDetails> findBetweenDates(String dateDebut,String dateFin);
	
	@Query(value="SELECT * FROM view_signalementDetails WHERE idUtilisateur = ?1 AND dateSignalement > ?2 AND dateSignalement < ?3",nativeQuery=true)
	List<SignalementDetails> findByUserBetweenDates(final Long idUtilisateur,String dateDebut,String dateFin);
}
