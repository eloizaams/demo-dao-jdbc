package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private String email;
	
	private Date birthDay;
	
	private Double baseSalary;
	
	private Department department;

	public Seller() {
	}

	public Seller(Integer id, String name, String email, Date birthDay, Double baseSalary, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDay = birthDay;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public final Integer getId() {
		return id;
	}

	public final void setId(Integer id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

	public final Date getBirthDay() {
		return birthDay;
	}

	public final void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public final Double getBaseSalary() {
		return baseSalary;
	}

	public final void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public final Department getDepartment() {
		return department;
	}

	public final void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthDay=" + birthDay + ", baseSalary="
				+ baseSalary + ", department=" + department + "]";
	}
	
	
}
