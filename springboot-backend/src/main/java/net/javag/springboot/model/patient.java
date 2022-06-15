package net.javag.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;

	
	@Column(name = "visiteddoctor")
	private String visiteddoctor;
	
	@Column(name = "dateofvisit")
	private String dateofvisit; 
	
	
	public patient() {
		
	}

	public patient(int id, String name, String visiteddoctor, String dateofvisit) {
		super();
		this.id = id;
		this.name = name;
		this.visiteddoctor = visiteddoctor;
		this.dateofvisit = dateofvisit;
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

	public String getVisiteddoctor() {
		return visiteddoctor;
	}

	public void setVisiteddoctor(String visiteddoctor) {
		this.visiteddoctor = visiteddoctor;
	}

	public String getDateofvisit() {
		return dateofvisit;
	}

	public void setDateofvisit(String dateofvisit) {
		this.dateofvisit = dateofvisit;
	}
}	