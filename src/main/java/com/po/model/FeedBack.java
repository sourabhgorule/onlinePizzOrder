package com.po.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

// import jakarta.annotation.NotNull;
import jakarta.persistence.*;

@Entity
@Table(name="tab_feedback")
public class FeedBack {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@NotNull
	@Column(name = "subject")
	private String subject;
	
	@NotNull
	@Column(name = "remark")
	private String remark;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_id")
	@NotNull
	private User user;
	
	
	@NotNull
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
}
