package com.parambara.domain.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_RELATION")
public class UserRelation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "USER_RELATION_ID_GENERATOR", sequenceName = "USER_RELATION_ID_SEQ", allocationSize = 1)
	@Column(name = "USER_RELATION_ID", updatable = false, nullable = false)
	private Long userRelationId;

	@Column(name = "USER_ID", updatable = false, nullable = false)
	private Long userId;

	@Column(name = "RELATED_USER_ID")
	private Long relatedUserId;

	@Column(name = "RELATIONSHIP_ID")
	private Long relationShipId;
	
	@Column(name = "RELATIONSHIP_VERIFIED_FL")
	private String relationShipVerifiedFL;
	
	@Column(name = "REF_USER_RELATION_ID")
	private Long refernceUserRelationId;

	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "LAST_MODIFIED_DATE")
	private Date lastModifiedDate;
	
}
