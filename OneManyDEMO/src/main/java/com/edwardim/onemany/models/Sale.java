package com.edwardim.onemany.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="sales")
public class Sale {
	// ------------------ MEMBER VARIABLES ---------------------//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	// client name
    @NotNull
    @Size(min=3)
    private String client;
	// sale amount
    @Positive
    private double purchaseAmount;
    
    // RELATIONSHIPS
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User salesPerson;
    
    
    // ------------------ MEMBER VARIABLES ---------------------//
    // EMPTY CONSTRUCTOR
    public Sale() {
    	
    }
    // FULL CONSTRUCTOR
	public Sale(@NotNull String client, @Positive double purchaseAmount) {
		super();
		this.client = client;
		this.purchaseAmount = purchaseAmount;
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
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public double getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
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
	public User getSalesPerson() {
		return salesPerson;
	}
	public void setSalesPerson(User salesPerson) {
		this.salesPerson = salesPerson;
	}
	
	
}
