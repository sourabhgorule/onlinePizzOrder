package com.po.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.annotation.Nonnull;
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
	
	@Nonnull
	@Column(name = "full_name")
	private String fullName;
	
	@Nonnull
	@Column(name = "username")
	private String username;
	
	@Nonnull
	@Column(name = "password")
	private String password;
	
	@Nonnull
	@Column(name = "email")
	private String email;
	
	@Nonnull
	@Column(name = "address")
	private String address;
	
	@Nonnull
	@Column(name = "is_customer")
	private String isCustomer;
	
	@Nonnull
	@Column(name = "is_admin")
	private String isAdmin;
	
	@Nonnull
	@Column(name = "mob_number")
	private String mobNumber;
	
	@Nonnull
	@Column(name = "active")
	private Integer active;
	
	
	@Nonnull
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;

	
}

