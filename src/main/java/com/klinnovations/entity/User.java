package com.klinnovations.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="user_details")
public class User {
	
	
@Id
private Integer Id;
private String name;
private String city;

}
