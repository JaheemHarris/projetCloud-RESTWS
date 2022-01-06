package com.projetCloud.projetCloudRESTWS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetCloud.projetCloudRESTWS.model.Signalement;

@Repository
public interface SignalementRepository extends JpaRepository<Signalement,Long>{

}
