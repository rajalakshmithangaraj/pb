package com.parambara.domain.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * User Profile Entity.
 * 
 * @author Raji Thangaraj
 * @author All rights reserved.
 */
@Entity
@Table(name="USER_PROFILE")
public class UserProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "USER_PROFILE_ID_GENERATOR", sequenceName = "USER_PROFILE_ID_SEQ", allocationSize = 1)
	@Column(name = "USER_PROFILE_ID", updatable = false, nullable = false)
	private Long userProfileId;

	@Column(name = "USER_ID", updatable = false, nullable = false)
	private Long userId;

	@Column(name = "PICTURE_URL")
	private String pictureUrl;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

	public Long getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(Long userProfileId) {
		this.userProfileId = userProfileId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
