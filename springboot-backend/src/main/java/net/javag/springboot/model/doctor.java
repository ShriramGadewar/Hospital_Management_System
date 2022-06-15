package net.javag.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private long id;
	
	@Column(name = "name")
	private String name;

	
	@Column(name = "age")
	private int age;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "specialist_field")
	private String specialist_field;  
	
	
	public doctor() {
		
	}

	public doctor(int id,String name, int age, String gender, String specialist_field) {
		super();
		this.id =id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialist_field = specialist_field;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecialist_field() {
		return specialist_field;
	}

	public void setSpecialist_field(String specialist_field) {
		this.specialist_field = specialist_field;
	}
}	