package com.po.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table(name="tab_feedback")
public class FeedBack {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Nonnull
	@Column(name = "subject")
	private String subject;
	
	@Nonnull
	@Column(name = "remark")
	private String remark;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_id")
	@Nonnull
	private User user;
	
	
	@Nonnull
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
}
