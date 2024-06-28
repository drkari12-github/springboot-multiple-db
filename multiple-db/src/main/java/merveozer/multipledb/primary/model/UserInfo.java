package merveozer.multipledb.primary.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "user_info")
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String userName;

	@Column(name = "sur_name")
	private String surName;

	@Column(name = "age")
	private int age;

}
