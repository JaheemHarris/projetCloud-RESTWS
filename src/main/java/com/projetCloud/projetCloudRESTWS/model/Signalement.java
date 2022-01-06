package com.projetCloud.projetCloudRESTWS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Signalement")
public class Signalement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long idType;
	private Long idRegion;
	private Long idUtilisateur;
	private Long idStatus;
	private String image;
	private String dateSignalement;
	private Double latitude;
	private Double longitude;
}