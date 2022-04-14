package com.edwardim.onemany.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	// ------------------ MEMBER VARIABLES ---------------------//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	// first name
    @NotNull
    private String firstName;
    // last name
    @NotNull
    private String lastName;
    
    // RELATIONSHIPS
    @OneToMany(mappedBy="salesPerson", fetch = FetchType.LAZY)
    private List<Sale> sales;
    
    
    
    
    // ------------------ MEMBER VARIABLES ---------------------//
    // EMPTY CONSTRUCTOR
    public User() {
    	
    }
    // FULL CONSTRUCTOR
    public User(@NotNull String firstName, @NotNull String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
    
    
    
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;

	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
	@PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public List<Sale> getSales() {
		return sales;
	}
	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}
	
	
}
