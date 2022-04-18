package com.edwardim.recipes.models;

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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="recipes")
public class Recipe {
	// MEMBER VARIABLES
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message="Name is required")
    @Size(min=2, message="Name must be longer than 2 characters")
    private String name;
    
    @NotEmpty(message="Description is required")
    private String description;
    
    @NotEmpty(message="Instructions is required")
    private String instructions;
    
    @NotNull(message="Date is Required")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date madeOn;
    
    @NotNull(message="Under 30 min Required")
    private boolean under30Minutes;
    
    // RELATIONSHIPS
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User creator;
    
    
    
    // CONSTRUCTORS
    
    public Recipe() {
    	
    }
    public Recipe(
			@NotEmpty(message = "Name is required") @Size(min = 2, message = "Name must be longer than 2 characters") String name,
			@NotEmpty(message = "Description is required") String description,
			@NotEmpty(message = "Instructions is required") String isntructions,
			@NotNull(message = "Date is Required") Date madeOn,
			@NotNull(message = "Under 30 min Required") boolean under30Minutes, User creator) {
		super();
		this.name = name;
		this.description = description;
		this.instructions = isntructions;
		this.madeOn = madeOn;
		this.under30Minutes = under30Minutes;
		this.creator = creator;
	}



	// GETTERS / SETTERS / OTHER METHODS
    
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public Date getMadeOn() {
		return madeOn;
	}
	public void setMadeOn(Date madeOn) {
		this.madeOn = madeOn;
	}
	public boolean isUnder30Minutes() {
		return under30Minutes;
	}
	public void setUnder30Minutes(boolean under30Minutes) {
		this.under30Minutes = under30Minutes;
	}
	public User getCreator() {
		return creator;
	}
	public void setCreator(User creator) {
		this.creator = creator;
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
	
}
