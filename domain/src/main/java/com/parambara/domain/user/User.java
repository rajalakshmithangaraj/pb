package com.parambara.domain.user;

import java.util.Date;

import javax.crypto.SealedObject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User Entity.
 * 
 * @author Raji Thangaraj
 * @author All rights reserved.
 *
 */
@Entity
@Table(name="USER")
public class User {
	
	@Id
	@Column(name="USER_ID", updatable = false, nullable = false)
	private Long userId;
	
	@Column(name="EMAIL")
	private String emailAddress;
	
	@Column(name="PASSWORD")
	private SealedObject password;
	
	@Column(name="PHONE")
	private Long phoneNumber;
	
	@Column(name="EMAIL_VERIFIED_FL")
	private char emailVerified;
	
	@Column(name="PHONE_VERIFIED_FL")
	private char phoneVerified;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	@Column(name="LAST_MODIFIED_DATE")
	private Date lastModifiedDate;
	
	@Column(name="LAST_LOGIN_DATE")
	private Date lastLoginDate;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public SealedObject getPassword() {
		return password;
	}

	public void setPassword(SealedObject password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public char getEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(char emailVerified) {
		this.emailVerified = emailVerified;
	}

	public char getPhoneVerified() {
		return phoneVerified;
	}

	public void setPhoneVerified(char phoneVerified) {
		this.phoneVerified = phoneVerified;
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

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
}
