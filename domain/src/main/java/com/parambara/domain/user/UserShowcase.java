package com.parambara.domain.user;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * User Showcase Entity class.
 * 
 * @author Raji Thangaraj
 * @author All rights reserved.
 */
@Entity
@Table(name="USER_WOF")
public class UserShowcase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "USER_WOF_ID_GENERATOR", sequenceName = "USER_USER_WOF_ID_SEQ", allocationSize = 1)
	@Column(name = "USER_WOF_ID", updatable = false, nullable = false)
	private Long userWallOdFameId;

	@Column(name = "USER_ID", updatable = false, nullable = false)
	private Long userId;

	@Column(name = "PICTURE_URL")
	private String pictureUrl;

	@Column(name = "DESCRIPTION")
	private Blob description;

	public Long getUserWallOdFameId() {
		return userWallOdFameId;
	}

	public void setUserWallOdFameId(Long userWallOdFameId) {
		this.userWallOdFameId = userWallOdFameId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public Blob getDescription() {
		return description;
	}

	public void setDescription(Blob description) {
		this.description = description;
	}
	
	

}
