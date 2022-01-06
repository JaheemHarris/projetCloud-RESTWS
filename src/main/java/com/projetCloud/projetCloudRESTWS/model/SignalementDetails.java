package com.projetCloud.projetCloudRESTWS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import lombok.Data;

@Data
@Immutable
@Entity
@Table(name="view_signalementdetails")
public class SignalementDetails {
	
	@Id
	@Column(name="idsignalement")
	private Long idSignalement;
	
	@Column(name="idtype")
	private Long idType;
	private String type;
	
	@Column(name="idregion")
	private Long idRegion;
	private String region;
	
	@Column(name="idutilisateur")
	private Long idUtilisateur;
	
	@Column(name="idstatus")
	private Long idStatus;
	
	private String status;
	private String description;
	private String image;
	
	@Column(name="datesignalement")
	private String dateSignalement;
	
	private Double latitude;
	private Double longitude;
}
