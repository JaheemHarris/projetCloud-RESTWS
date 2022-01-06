package com.projetCloud.projetCloudRESTWS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="signalement")
public class Signalement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="idtype")
	private Long idType;
	
	@Column(name="idregion")
	private Long idRegion;
	
	@Column(name="idutilisateur")
	private Long idUtilisateur;
	
	@Column(name="idstatus")
	private Long idStatus;
	
	private String image;
	
	@Column(name="datesignalement")
	private String dateSignalement;
	
	private Double latitude;
	private Double longitude;
}