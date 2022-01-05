package com.projetCloud.projetCloudRESTWS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetCloud.projetCloudRESTWS.repository.TypeSignalementRepo;


@Service
public class TypeSignalementService {
	
	@Autowired
	private TypeSignalementRepo typeRepo;
}
