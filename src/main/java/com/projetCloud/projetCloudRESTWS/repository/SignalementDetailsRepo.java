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
	
	@Query(value="SELECT * FROM view_signalementDetails WHERE idStatus = ?1",nativeQuery=true)
	List<SignalementDetails> findByStatus(final Long idStatus);
	
	@Query(value="SELECT * FROM view_signalementDetails WHERE dateSignalement > ?1 AND dateSignalement < ?2",nativeQuery=true)
	List<SignalementDetails> findBetweenDates(String dateDebut,String dateFin);
}
