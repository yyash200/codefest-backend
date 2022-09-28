package com.startyounguk.codefestbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "org_info_master")
public class LandingEntity {

	@Id
	@Column(name = "info_type")
	private String infoType;

	@Column(name = "description")
	private String description;

	public String getInfoType() {
		return infoType;
	}

	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
