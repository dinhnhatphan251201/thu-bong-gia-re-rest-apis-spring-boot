package vn.edu.iuh.fit.se.thubonggiareapis.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "uuid")
	@Column(name = "id", unique = true, updatable = false, columnDefinition = "CHAR(36)")
	private String id;
	
	@Column(nullable = false)
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String phoneNumber;
	
	@Column
	private String password;
	
	@OneToMany(mappedBy = "createdBy")
	private List<Promotion> promotions = new ArrayList<Promotion>();
	
	@OneToMany(mappedBy = "approvedBy")
	private List<Order> orders = new ArrayList<Order>();

	public User() {
		super();
	}

	public User(String id) {
		super();
		this.id = id;
	}

	public User(String name, String email, String phoneNumber, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}

	public User(String id, String name, String email, String phoneNumber, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", password="
				+ password + "]";
	}

	
	
	
	
	
}
