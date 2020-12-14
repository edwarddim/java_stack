package com.edwardim.semiresttv.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="shows")
public class Show {
//	ATTRIBUTES
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Size(min = 2, max=50, message = "Title must be between 2-50")
	private String title;
	
	@Size(min = 2, max=50, message = "Network must be between 2-50")
	private String network;
	
	@NotNull(message = "You must have release date")
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date release_date;
	
	@Size(min = 2, max=50, message = "Description must be between 2-50")
	private String description;
	
//	CONSTRUCOTRS
	public Show() {
		
	}
	
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
	@PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
//    GETTERS AND SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public Date getRelease_date() {
		return release_date;
	}
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
