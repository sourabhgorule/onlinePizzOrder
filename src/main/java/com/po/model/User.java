package com.po.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

// import jakarta.annotation.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tab_user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public User() {}
	
	

	public User(Long id, String fullName, String username, String password, String email, String address,
			String isCustomer, String isAdmin, String mobNumber, Integer active) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.isCustomer = isCustomer;
		this.isAdmin = isAdmin;
		this.mobNumber = mobNumber;
		this.active = active;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@NotNull
	@Column(name = "full_name")
	private String fullName;
	
	@NotNull
	@Column(name = "username")
	private String username;
	
	@NotNull
	@Column(name = "password")
	private String password;
	
	@NotNull
	@Column(name = "email")
	private String email;
	
	@NotNull
	@Column(name = "address")
	private String address;
	
	@NotNull
	@Column(name = "is_customer")
	private String isCustomer;
	
	@NotNull
	@Column(name = "is_admin")
	private String isAdmin;
	
	@NotNull
	@Column(name = "mob_number")
	private String mobNumber;
	
	@NotNull
	@Column(name = "active")
	private Integer active;
	
	
	@NotNull
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;

	
}

