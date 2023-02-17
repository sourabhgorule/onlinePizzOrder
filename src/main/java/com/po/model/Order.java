package com.po.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table(name="tab_order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@NotNull
	@Column(name="address")
	private String address;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_id")
	@NotNull(message = "*Please select user")
	private User User;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "pizzatype_id")
	@NotNull(message = "*Please select pizzatype")
	private Pizzatype pizzatype;
	
	
	@Nonnull
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
}
