package com.projetCloud.projetCloudRESTWS.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import lombok.Data;

@Data
@Immutable
@Entity
@Table(name="view_signalementDetails")
public class SignalementDetails {
	
	@Id
	private Long id;
	private Long idType;
	private String type;
	private Long idRegion;
	private String region;
	private Long idUtilisateur;
	private Long idStatus;
	private String status;
	private String image;
	private String dateSignalement;
	private Double latitude;
	private Double longitude;
}
