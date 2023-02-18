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

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getIsCustomer() {
		return isCustomer;
	}



	public void setIsCustomer(String isCustomer) {
		this.isCustomer = isCustomer;
	}



	public String getIsAdmin() {
		return isAdmin;
	}



	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}



	public String getMobNumber() {
		return mobNumber;
	}



	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}



	public Integer getActive() {
		return active;
	}



	public void setActive(Integer active) {
		this.active = active;
	}



	public Date getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}



	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}



	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
	
	

	
}

