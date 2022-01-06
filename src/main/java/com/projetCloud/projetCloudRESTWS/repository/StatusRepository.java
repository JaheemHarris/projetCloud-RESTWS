package com.projetCloud.projetCloudRESTWS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetCloud.projetCloudRESTWS.model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status,Long>{

}
